package Controller;

import Model.Circuit;
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

    public void loadRemoteInfo(ArrayList<Circuit> circuits) throws SQLException {
        ResultSet rs;
        Statement stmt;

        System.out.println("Reading remote info");

        stmt = remoteConnection.createStatement();
        stmt.executeQuery("USE F1");

        stmt = remoteConnection.createStatement();
        rs = stmt.executeQuery("SELECT * FROM circuits");
        Circuit circuit;
        while (rs.next()) {
            circuit = new Circuit();
            circuit.setCircuitId(rs.getInt("circuitId"));
            circuit.setCircuitRef(rs.getString("circuitRef"));
            circuit.setName(rs.getString("name"));
            circuit.setLocation(rs.getString("location"));
            circuit.setCountry(rs.getString("country"));
            circuit.setLat(rs.getDouble("lat"));
            circuit.setLng(rs.getDouble("lng"));
            circuit.setAlt(rs.getInt("alt"));
            circuit.setUrl(rs.getString("url"));
            circuits.add(circuit);
        }
        rs.close();
        stmt.close();

        //TODO: Modify for the tables in F1 database
    }
}
