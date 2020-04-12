package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;

public class LapTime {
    private int raceId;
    private int driverId;
    private int lap;
    private int position;
    private Time time;
    private double milliseconds;

    public LapTime(ResultSet rs){
        try{
            this.raceId = rs.getInt("raceId");
            this.driverId = rs.getInt("driverId");
            this.lap = rs.getInt("lap");
            this.position = rs.getInt("position");
            this.time = rs.getTime("time");
            this.milliseconds = rs.getDouble("milliseconds");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public int getRace_id() {
        return raceId;
    }

    public void setRace_id(int race_id) {
        this.raceId = race_id;
    }

    public int getDriver_id() {
        return driverId;
    }

    public void setDriver_id(int driver_id) {
        this.driverId = driver_id;
    }

    public int getLap() {
        return lap;
    }

    public void setLap(int lap) {
        this.lap = lap;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
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

    public void setMilliseconds(double milliseconds) {
        this.milliseconds = milliseconds;
    }
}
