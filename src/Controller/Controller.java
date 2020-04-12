package Controller;

import Model.*;
import Model.Driver;

import java.sql.*;
import java.util.ArrayList;

public class Controller {

    private Connection remoteConnection;
    private ArrayList<Circuit> circuits = new ArrayList<>();
    private ArrayList<Constructor> constructors = new ArrayList<>();
    private ArrayList<ConstructorResult> constructorResults = new ArrayList<>();
    private ArrayList<ConstructorStanding> constructorStandings = new ArrayList<>();
    private ArrayList<Driver> drivers = new ArrayList<>();
    private ArrayList<DriverStanding> driverStandings = new ArrayList<>();
    private ArrayList<LapTime> lapTimes = new ArrayList<>();
    private ArrayList<PitStop> pitStops = new ArrayList<>();
    private ArrayList<Qualifying> qualifyings = new ArrayList<>();
    private ArrayList<Race> races = new ArrayList<>();
    private ArrayList<Result> results = new ArrayList<>();
    private ArrayList<Season> seasons = new ArrayList<>();
    private ArrayList<Status> statuses = new ArrayList<>();


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

    public void loadRemoteInfo() throws SQLException {
        Statement stmt;

        System.out.println("Reading remote info");

        stmt = remoteConnection.createStatement();
        stmt.executeQuery("USE F1");

    }

    private void loadCircuits(){
        ResultSet rs;
        try{
            Statement stmt = remoteConnection.createStatement();
            rs = stmt.executeQuery("SELECT * FROM circuits");
            Circuit circuit;
            while (rs.next()) {
                circuit = new Circuit(rs);
                circuits.add(circuit);
            }

            rs.close();
            stmt.close();

            }catch(SQLException e){
                e.printStackTrace();
            }
    }

    public ArrayList<Circuit> getCircuits() {
        return circuits;
    }
}
