package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class Driver {
    private int driverId;
    private String driverRef;
    private int number;
    private String code;
    private String forename;
    private String surname;
    private Date dob; // Date of birth.
    private String nationality;
    private String url;

    public Driver(ResultSet rs){
        try{
            this.driverId = rs.getInt("driverId");
            this.driverRef = rs.getString("driverRef");
            this.number = rs.getInt("number");
            this.code = rs.getString("code");
            this.forename = rs.getString("forename");
            this.surname = rs.getString("surname");
            this.dob = rs.getDate("dob");
            this.nationality = rs.getString("nationality");
            this.url = rs.getString("url");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public int getDriver_id() {
        return driverId;
    }

    public void setDriver_id(int driver_id) {
        this.driverId = driver_id;
    }

    public String getDriver_ref() {
        return driverRef;
    }

    public void setDriver_ref(String driver_ref) {
        this.driverRef = driver_ref;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getSurname() { return surname; }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getDate_of_birth() {
        return dob;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.dob = date_of_birth;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
