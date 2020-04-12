package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;

public class PitStop {
    private int raceId;
    private int driverId;
    private int stop;
    private int lap;
    private Time time;
    private Double duration;
    private int milliseconds;

    public PitStop(ResultSet rs){
        try{
            this.raceId = rs.getInt("raceId");
            this.driverId = rs.getInt("driverId");
            this.stop = rs.getInt("stop");
            this.lap = rs.getInt("lap");
            this.time = rs.getTime("time");
            this.duration = rs.getDouble("duration");
            this.milliseconds = rs.getInt("milliseconds");

        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public int getRace_id() {
        return raceId;
    }

    public void setRace_id(int raceId) {
        this.raceId = raceId;
    }

    public int getDriver_id() {
        return driverId;
    }

    public void setDriver_id(int driver_id) {
        this.driverId = driver_id;
    }

    public int getStop() {
        return stop;
    }

    public void setStop(int stop) {
        this.stop = stop;
    }

    public int getLap() {
        return lap;
    }

    public void setLap(int lap) {
        this.lap = lap;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public int getMilliseconds() {
        return milliseconds;
    }

    public void setMilliseconds(int milliseconds) {
        this.milliseconds = milliseconds;
    }
}
