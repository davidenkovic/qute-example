package at.htl.resources;

import at.htl.entities.Player;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.LinkedList;
import java.util.List;

@ApplicationScoped
@Path("players")
public class PlayerResource {

    @Inject
    Template players;

    @Path("/healthy")
    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance getHealthy() {
        List<Player> playerList = new LinkedList<>();

        playerList.add(new Player(1,"Nikola Jokic","Center",false,"Denver Nuggets"));
        playerList.add(new Player(2,"LeBron James","Small Forward",false,"LA Lakers"));
        playerList.add(new Player(3,"Luka Doncic","Shooting Guard",false,"Dallas Mavericks"));
        playerList.add(new Player(4,"Jimmy Buttler","Small Forward",false,"Chicago Bulls"));
        playerList.add(new Player(5,"Bozidar Spasenovic","Point Guard",false,"Crvena Zvezda"));

        return players.data("players",playerList);
    }

    @Path("/injured")
    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance getInjured() {
        List<Player> playerList = new LinkedList<>();

        playerList.add(new Player(1,"Nikola Jokic","Center",false,"Denver Nuggets"));
        playerList.add(new Player(2,"LeBron James","Small Forward",false,"LA Lakers"));
        playerList.add(new Player(3,"Luka Doncic","Shooting Guard",false,"Dallas Mavericks"));
        playerList.add(new Player(4,"Jimmy Buttler","Small Forward",false,"Chicago Bulls"));
        playerList.add(new Player(5,"Bozidar Spasenovic","Point Guard",true,"Crvena Zvezda"));

        return players.data("players",playerList);
    }
}
