package Model;

public class ConstructorResult {
    private int constructorResultsId;
    private int raceId;
    private int constructorId;
    private int points;
    private char status;

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

    public char getStatus() {
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

    public void setStatus(char status) {
        this.status = status;
    }
}
