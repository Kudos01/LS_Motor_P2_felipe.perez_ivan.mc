package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.Date;

public class Race {
    private int raceId;
    private int year;
    private int round;
    private int circuitId;
    private String name;
    private Date date;
    private Time time;
    private String url;

    public Race(ResultSet rs){
        try{
            this.raceId = rs.getInt("raceId");
            this.year = rs.getInt("year");
            this.round = rs.getInt("round");
            this.circuitId = rs.getInt("circuitId");
            this.name = rs.getString("name");
            this.date = rs.getDate("date");
            this.time = rs.getTime("time");
            this.url = rs.getString("url");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public int getRaceId() {
        return raceId;
    }

    public void setRaceId(int raceId) {
        this.raceId = raceId;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public int getCircuitId() {
        return circuitId;
    }

    public void setCircuitId(int circuitId) {
        this.circuitId = circuitId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
