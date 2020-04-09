package Model;

import java.sql.Time;

public class qualifying {
    private int qualify_id;
    private int race_id;
    private int driver_id;
    private int constructor_id;
    private int number;
    private int position;
    private Time q1;
    private Time q2;
    private Time q3;

    public int getQualify_id() {
        return qualify_id;
    }

    public void setQualify_id(int qualify_id) {
        this.qualify_id = qualify_id;
    }

    public int getRace_id() {
        return race_id;
    }

    public void setRace_id(int race_id) {
        this.race_id = race_id;
    }

    public int getDriver_id() {
        return driver_id;
    }

    public void setDriver_id(int driver_id) {
        this.driver_id = driver_id;
    }

    public int getConstructor_id() {
        return constructor_id;
    }

    public void setConstructor_id(int constructor_id) {
        this.constructor_id = constructor_id;
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
