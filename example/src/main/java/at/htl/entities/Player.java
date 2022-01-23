package at.htl.entities;

public class Player {
    public int pickNumber;
    public String name;
    public String position;
    public boolean isInjured;
    public String Team;

    public Player(int pickNumber, String name, String position, boolean isInjured, String team) {
        this.pickNumber = pickNumber;
        this.name = name;
        this.position = position;
        this.isInjured = isInjured;
        Team = team;
    }

    public int getPickNumber() {
        return pickNumber;
    }

    public void setPickNumber(int pickNumber){
        this.pickNumber = pickNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean isInjured() {
        return isInjured;
    }

    public void setInjured(boolean injured) {
        isInjured = injured;
    }

    public String getTeam() {
        return Team;
    }

    public void setTeam(String team) {
        Team = team;
    }

    @Override
    public String toString() {
        return name;
    }
}
