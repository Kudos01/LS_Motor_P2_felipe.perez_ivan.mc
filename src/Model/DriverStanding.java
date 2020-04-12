package Model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DriverStanding {
    private int driverStandingsId;
    private int raceId;
    private int points;
    private int position;
    private int positionText;
    private int wins;

    public DriverStanding(ResultSet rs){
        try{
            this.driverStandingsId = rs.getInt("driverStandingsId");
            this.raceId = rs.getInt("raceId");
            this.points = rs.getInt("points");
            this.position = rs.getInt("position");
            this.positionText = rs.getInt("positionText");
            this.wins = rs.getInt("wins");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public int getDriver_Standings_id() {
        return driverStandingsId;
    }

    public void setDriver_Standings_id(int driver_Standings_id) {
        this.driverStandingsId = driver_Standings_id;
    }

    public int getRace_id() {
        return raceId;
    }

    public void setRace_id(int race_id) {
        this.raceId = race_id;
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

    public void setPosition(int position) { this.position = position; }

    public int getPosition_text() {
        return positionText;
    }

    public void setPosition_text(int position_text) {
        this.positionText = position_text;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }
}
