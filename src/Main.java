import Controller.Controller;
import Model.Circuit;
import Model.LapTime;

import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Controller controller = new Controller();

        long start = System.nanoTime();

        //REMOTE DB PART
        System.out.println("Connecting to Database...");
        if (!controller.startRemoteConnection()) System.exit(1);

        try {
            controller.loadRemoteInfo();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        //LOCAL DB PART
        System.out.println("Connecting to local Database...");

        if (!controller.startLocalhostConnection()) System.exit(1);

        try {
            controller.dumpLocalInfo();


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        long elapsedTime = System.nanoTime() - start;

        System.out.println("Elapsed time: " + elapsedTime/(60*1000F));

    }
}
