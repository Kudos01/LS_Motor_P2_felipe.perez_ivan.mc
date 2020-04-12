package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;

public class Result {
    private int resultId;
    private int raceId;
    private int driverId;
    private int constructorId;
    private int number;
    private int grid;
    private int position;
    private int positionText;
    private int positionOrder;
    private int points;
    private int laps;
    private Time time;
    private double milliseconds;
    private int fastestLap;
    private int rank;
    private Time fastestLapTime;
    private Double fastestLapSpeed;

    public Result(ResultSet rs){
        try{
            this.resultId = rs.getInt("resultId");
            this.raceId = rs.getInt("raceId");
            this.driverId = rs.getInt("driverId");
            this.constructorId = rs.getInt("constructorId");
            this.number = rs.getInt("number");
            this.grid = rs.getInt("grid");
            this.position = rs.getInt("position");
            this.positionText = rs.getInt("positionText");
            this.positionOrder = rs.getInt("positionOrder");
            this.points = rs.getInt("points");
            this.laps = rs.getInt("laps");
            this.time = rs.getTime("time");
            this.milliseconds = rs.getDouble("milliseconds");
            this.fastestLap = rs.getInt("fastestLap");
            this.rank = rs.getInt("rank");
            this.fastestLapTime = rs.getTime("fastestLapTime");
            this.fastestLapSpeed = rs.getDouble("fastestLapSpeed");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public int getResultId() {
        return resultId;
    }

    public void setResultId(int resultId) {
        this.resultId = resultId;
    }

    public int getRaceId() {
        return raceId;
    }

    public void setRaceId(int raceId) {
        this.raceId = raceId;
    }

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public int getConstructorId() {
        return constructorId;
    }

    public void setConstructorId(int constructorId) {
        this.constructorId = constructorId;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getGrid() {
        return grid;
    }

    public void setGrid(int grid) {
        this.grid = grid;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getPositionText() {
        return positionText;
    }

    public void setPositionText(int positionText) {
        this.positionText = positionText;
    }

    public int getPositionOrder() {
        return positionOrder;
    }

    public void setPositionOrder(int positionOrder) {
        this.positionOrder = positionOrder;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getLaps() {
        return laps;
    }

    public void setLaps(int laps) {
        this.laps = laps;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public double getMilliseconds() {
        return milliseconds;
    }

    public void setMilliseconds(int milliseconds) {
        this.milliseconds = milliseconds;
    }

    public int getFastestLap() {
        return fastestLap;
    }

    public void setFastestLap(int fastestLap) {
        this.fastestLap = fastestLap;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public Time getFastestLapTime() {
        return fastestLapTime;
    }

    public void setFastestLapTime(Time fastestLapTime) {
        this.fastestLapTime = fastestLapTime;
    }

    public double getFastestLapSpeed() {
        return fastestLapSpeed;
    }

    public void setFastestLapSpeed(double fastestLapSpeed) {
        this.fastestLapSpeed = fastestLapSpeed;
    }
}
