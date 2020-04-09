package Model;

import java.sql.Time;

public class Result {
    private int result_id;
    private int race_id;
    private int driver_id;
    private int constructor_id;
    private int number;
    private int grid;
    private int position;
    private int position_text;
    private int position_order;
    private int points;
    private int laps;
    private Time time;
    private int milliseconds;
    private int fastest_lap;
    private int rank;
    private Time fastest_lap_time;
    private float fastest_lap_speed;

    public int getResult_id() {
        return result_id;
    }

    public void setResult_id(int result_id) {
        this.result_id = result_id;
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

    public int getPosition_text() {
        return position_text;
    }

    public void setPosition_text(int position_text) {
        this.position_text = position_text;
    }

    public int getPosition_order() {
        return position_order;
    }

    public void setPosition_order(int position_order) {
        this.position_order = position_order;
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

    public int getMilliseconds() {
        return milliseconds;
    }

    public void setMilliseconds(int milliseconds) {
        this.milliseconds = milliseconds;
    }

    public int getFastest_lap() {
        return fastest_lap;
    }

    public void setFastest_lap(int fastest_lap) {
        this.fastest_lap = fastest_lap;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public Time getFastest_lap_time() {
        return fastest_lap_time;
    }

    public void setFastest_lap_time(Time fastest_lap_time) {
        this.fastest_lap_time = fastest_lap_time;
    }

    public float getFastest_lap_speed() {
        return fastest_lap_speed;
    }

    public void setFastest_lap_speed(float fastest_lap_speed) {
        this.fastest_lap_speed = fastest_lap_speed;
    }
}
