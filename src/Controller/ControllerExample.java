package Controller;

import Model.ModelExample;
import Model.Settings;

import java.sql.*;
import java.util.ArrayList;

public class ControllerExample {

    private Connection remoteConnection;

    public boolean startRemoteConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            remoteConnection = DriverManager.getConnection("jdbc:mysql://puigpedros.salleurl.edu/?user=" + Settings.REMOTEUSER + "&password=" + Settings.REMOTEPASSWORD + "&serverTimezone=UTC");
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public void loadRemoteInfo(ArrayList<ModelExample> modelsExamples) throws SQLException {
        ResultSet rs;
        Statement stmt;

        System.out.println("Reading remote info");

        stmt = remoteConnection.createStatement();
        stmt.executeQuery("USE Movies ");

        stmt = remoteConnection.createStatement();
        rs = stmt.executeQuery("SELECT * FROM movie");
        ModelExample modelExample;
        while (rs.next()) {
            modelExample = new ModelExample();
            modelExample.setId_movie(rs.getInt("id_movie"));
            modelExample.setTitle(rs.getString("title"));
            modelExample.setId_director(rs.getInt("id_director"));
            modelExample.setYear(rs.getInt("year"));
            modelExample.setDuration(rs.getInt("duration"));
            modelExample.setCountry(rs.getString("country"));
            modelExample.setMovie_facebook_likes(rs.getInt("movie_facebook_likes"));
            modelExample.setImdb_score(rs.getDouble("imdb_score"));
            modelExample.setGross(rs.getLong("gross"));
            modelExample.setBudget(rs.getLong("budget"));
            modelsExamples.add(modelExample);
        }
        rs.close();
        stmt.close();

        //TODO: Modify for the tables in F1 database
    }
}
