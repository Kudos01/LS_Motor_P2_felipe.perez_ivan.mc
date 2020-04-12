package Model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Constructor {
    private int constructorId;
    private String ConstructorRef;
    private String name;
    private String nationality;
    private String url;

    public Constructor(ResultSet rs){
        try{
            this.constructorId = rs.getInt("constructorId");
            this.ConstructorRef = rs.getString("constructorRef");
            this.name = rs.getString("name");
            this.nationality = rs.getString("nationality");
            this.url = rs.getString("url");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public int getConstructorId() {
        return constructorId;
    }

    public void setConstructorId(int constructorId) {
        this.constructorId = constructorId;
    }

    public String getConstructorRef() {
        return ConstructorRef;
    }

    public void setConstructorRef(String constructorRef) {
        ConstructorRef = constructorRef;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
