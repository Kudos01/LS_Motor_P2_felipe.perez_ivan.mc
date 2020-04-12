package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;

public class Qualifying {
    private int qualifyId;
    private int raceId;
    private int driverId;
    private int constructorId;
    private int number;
    private int position;
    private Time q1;
    private Time q2;
    private Time q3;

    public Qualifying(ResultSet rs){
        try{
            this.qualifyId = rs.getInt("qualifyId");
            this.raceId = rs.getInt("raceId");
            this.driverId = rs.getInt("driverId");
            this.constructorId = rs.getInt("constructorId");
            this.number = rs.getInt("number");
            this.position = rs.getInt("position");
            this.q1 = rs.getTime("q1");
            this.q2 = rs.getTime("q2");
            this.q3 = rs.getTime("q3");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public int getQualifyId() {
        return qualifyId;
    }

    public void setQualifyId(int qualifyId) {
        this.qualifyId = qualifyId;
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

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public Time getQ1() {
        return q1;
    }

    public void setQ1(Time q1) {
        this.q1 = q1;
    }

    public Time getQ2() {
        return q2;
    }

    public void setQ2(Time q2) {
        this.q2 = q2;
    }

    public Time getQ3() {
        return q3;
    }

    public void setQ3(Time q3) {
        this.q3 = q3;
    }
}
