package Model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Season {
    private int year;
    private String url;

    public Season(ResultSet rs){
        try{
            this.year = rs.getInt("year");
            this.url = rs.getString("url");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
