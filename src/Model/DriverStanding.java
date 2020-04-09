package Model;

public class DriverStanding {
    private int driver_Standings_id;
    private int race_id;
    private int points;
    private int position;
    private int position_text;
    private int wins;

    public int getDriver_Standings_id() {
        return driver_Standings_id;
    }

    public void setDriver_Standings_id(int driver_Standings_id) {
        this.driver_Standings_id = driver_Standings_id;
    }

    public int getRace_id() {
        return race_id;
    }

    public void setRace_id(int race_id) {
        this.race_id = race_id;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getPosition_text() {
        return position_text;
    }

    public void setPosition_text(int position_text) {
        this.position_text = position_text;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }
}
