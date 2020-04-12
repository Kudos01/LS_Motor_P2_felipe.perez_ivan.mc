package Model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ConstructorResult {
    private int constructorResultsId;
    private int raceId;
    private int constructorId;
    private int points;
    private String status;

    public ConstructorResult(ResultSet rs){
        try{
            this.constructorResultsId = rs.getInt("constructorResultsId");
            this.raceId = rs.getInt("raceId");
            this.constructorId = rs.getInt("name");
            this.points = rs.getInt("points");
            this.status = rs.getString("status");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public int getConstructorResultsId() {
        return constructorResultsId;
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

    public String getStatus() {
        return status;
    }

    public void setConstructorResultsId(int constructorResultsId) {
        this.constructorResultsId = constructorResultsId;
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

    public void setStatus(String status) {
        this.status = status;
    }
}
