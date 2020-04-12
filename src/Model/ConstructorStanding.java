package Model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ConstructorStanding {
    private int constructorStandingsId;
    private int raceId;
    private int constructorId;
    private int points;
    private int position;
    private String positionText;
    private int wins;

    public ConstructorStanding(ResultSet rs){
        try{
            this.constructorStandingsId = rs.getInt("constructorStandingsId");
            this.raceId = rs.getInt("raceId");
            this.constructorId = rs.getInt("name");
            this.points = rs.getInt("points");
            this.position = rs.getInt("position");
            this.positionText = rs.getString("positionText");
            this.wins = rs.getInt("wins");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public int getConstructorStandingsId() {
        return constructorStandingsId;
    }

    public int getRaceId() {
        return raceId;
    }

    public int getConstructorId() {
        return constructorId;
    }

    public int getPoints() {
        return points;
    }

    public int getPosition() {
        return position;
    }

    public String getPositionText() {
        return positionText;
    }

    public int getWins() {
        return wins;
    }

    public void setConstructorStandingsId(int constructorStandingsId) {
        this.constructorStandingsId = constructorStandingsId;
    }

    public void setRaceId(int raceId) {
        this.raceId = raceId;
    }

    public void setConstructorId(int constructorId) {
        this.constructorId = constructorId;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void setPositionText(String positionText) {
        this.positionText = positionText;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }
}
