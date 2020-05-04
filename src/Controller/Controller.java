package Controller;

import Model.*;
import Model.Driver;

import java.io.Console;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Controller {

    private Connection remoteConnection;
    private Connection localConnection;
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

    public boolean startLocalhostConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Scanner sc = new Scanner(System.in);

            Console console = System.console();

            //asking the user for the localhost password
            System.out.println("Please insert your localhost password: ");

            String pass = sc.nextLine();

            localConnection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306?verifyServerCertificate=false&useSSL=true", "root", pass);
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

        loadCircuits();
        loadConstructor();
        loadConstructorResult();
        loadConstructorStanding();
        loadDriver();
        loadDriverStanding();
        loadLapTime();
        loadPitStops();
        loadQualifying();
        loadRaces();
        loadResults();
        loadSeason();
        loadStatus();

        stmt.close();
    }

    public void dumpLocalInfo() throws SQLException {
        System.out.println("Loading info to local F1 DB");
        Statement stmt = localConnection.createStatement();
        stmt.executeQuery("USE F1");

        ResultSet rs;

        //Insert queries to the local DB with the info we have
        insertCircuits();

    }

    private void insertCircuits(){
        try{
            Statement stmt = localConnection.createStatement();

            StringBuilder sb = new StringBuilder();

            stmt.execute("Truncate Circuits;");

            for (int i = 0; i < circuits.size(); i++) {
                sb.append("INSERT INTO Circuits VALUES (");
                sb.append(circuits.get(i).getCircuitId()).append(",");
                sb.append("'").append(circuits.get(i).getCircuitRef()).append("'").append(",");
                sb.append("'").append(circuits.get(i).getName()).append("'").append(",");
                sb.append("'").append(circuits.get(i).getLocation()).append("'").append(",");
                sb.append("'").append(circuits.get(i).getCountry()).append("'").append(",");
                sb.append(circuits.get(i).getLat()).append(",");
                sb.append(circuits.get(i).getLng()).append(",");
                sb.append(circuits.get(i).getAlt()).append(",");
                sb.append("'").append(circuits.get(i).getUrl()).append("'").append(");");

                stmt.execute(sb.toString());

                sb.delete(0, sb.length());
            }

            stmt.close();

        }catch(SQLException e){
            e.printStackTrace();
        }
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

    private void loadPitStops(){
        ResultSet rs;
        try{
            Statement stmt = remoteConnection.createStatement();
            rs = stmt.executeQuery("SELECT * FROM pitStops");
            PitStop pitStop;
            while (rs.next()) {
                pitStop = new PitStop(rs);
                pitStops.add(pitStop);
            }

            rs.close();
            stmt.close();

        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    private void loadQualifying(){
        ResultSet rs;
        try{
            Statement stmt = remoteConnection.createStatement();
            rs = stmt.executeQuery("SELECT * FROM qualifying");
            Qualifying qualifying;
            while (rs.next()) {
                qualifying = new Qualifying(rs);
                qualifyings.add(qualifying);
            }

            rs.close();
            stmt.close();

        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    private void loadRaces(){
        ResultSet rs;
        try{
            Statement stmt = remoteConnection.createStatement();
            rs = stmt.executeQuery("SELECT * FROM races");
            Race race;
            while (rs.next()) {
                race = new Race(rs);
                races.add(race);
            }

            rs.close();
            stmt.close();

        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    private void loadResults(){
        ResultSet rs;
        try{
            Statement stmt = remoteConnection.createStatement();
            rs = stmt.executeQuery("SELECT * FROM results");
            Result result;
            while (rs.next()) {
                result = new Result(rs);
                results.add(result);
            }

            rs.close();
            stmt.close();

        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    private void loadConstructor(){
        ResultSet rs;
        try{
            Statement stmt = remoteConnection.createStatement();
            rs = stmt.executeQuery("SELECT * FROM constructors");
            Constructor constructor;
            while (rs.next()) {
                constructor = new Constructor(rs);
                constructors.add(constructor);
            }
            rs.close();
            stmt.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    private void loadConstructorResult(){
        ResultSet rs;
        try{
            Statement stmt = remoteConnection.createStatement();
            rs = stmt.executeQuery("SELECT * FROM constructorResults");
            ConstructorResult constructorResult;
            while (rs.next()) {
                constructorResult = new ConstructorResult(rs);
                constructorResults.add(constructorResult);
            }
            rs.close();
            stmt.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    private void loadConstructorStanding(){
        ResultSet rs;
        try{
            Statement stmt = remoteConnection.createStatement();
            rs = stmt.executeQuery("SELECT * FROM constructorStandings");
            ConstructorStanding constructorStanding;
            while (rs.next()) {
                constructorStanding = new ConstructorStanding(rs);
                constructorStandings.add(constructorStanding);
            }
            rs.close();
            stmt.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    private void loadDriver(){
        ResultSet rs;
        try{
            Statement stmt = remoteConnection.createStatement();
            rs = stmt.executeQuery("SELECT * FROM drivers");
            Driver driver;
            while (rs.next()) {
                driver = new Driver(rs);
                drivers.add(driver);
            }
            rs.close();
            stmt.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    private void loadDriverStanding(){
        ResultSet rs;
        try{
            Statement stmt = remoteConnection.createStatement();
            rs = stmt.executeQuery("SELECT * FROM driverStandings");
            DriverStanding driverStanding;
            while (rs.next()) {
                driverStanding = new DriverStanding(rs);
                driverStandings.add(driverStanding);
            }
            rs.close();
            stmt.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    private void loadLapTime(){
        ResultSet rs;
        try{
            Statement stmt = remoteConnection.createStatement();
            rs = stmt.executeQuery("SELECT * FROM lapTimes");
            LapTime lapTime;
            while (rs.next()) {
                lapTime = new LapTime(rs);
                lapTimes.add(lapTime);
            }
            rs.close();
            stmt.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    private void loadStatus(){
        ResultSet rs;
        try{
            Statement stmt = remoteConnection.createStatement();
            rs = stmt.executeQuery("SELECT * FROM status");
            Status status;
            while (rs.next()) {
                status = new Status(rs);
                statuses.add(status);
            }
            rs.close();
            stmt.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    private void loadSeason(){
        ResultSet rs;
        try{
            Statement stmt = remoteConnection.createStatement();
            rs = stmt.executeQuery("SELECT * FROM seasons");
            Season season;
            while (rs.next()) {
                season = new Season(rs);
                seasons.add(season);
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

    public ArrayList<Constructor> getConstructors() {
        return constructors;
    }

    public ArrayList<ConstructorResult> getConstructorResults() {
        return constructorResults;
    }

    public ArrayList<ConstructorStanding> getConstructorStandings() {
        return constructorStandings;
    }

    public ArrayList<Driver> getDrivers() {
        return drivers;
    }

    public ArrayList<DriverStanding> getDriverStandings() {
        return driverStandings;
    }

    public ArrayList<LapTime> getLapTimes() {
        return lapTimes;
    }

    public ArrayList<PitStop> getPitStops() {
        return pitStops;
    }

    public ArrayList<Qualifying> getQualifyings() {
        return qualifyings;
    }

    public ArrayList<Race> getRaces() {
        return races;
    }

    public ArrayList<Result> getResults() {
        return results;
    }

    public ArrayList<Season> getSeasons() {
        return seasons;
    }

    public ArrayList<Status> getStatuses() {
        return statuses;
    }
}
