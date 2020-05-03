import Controller.Controller;
import Model.Circuit;
import Model.LapTime;

import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Controller controller = new Controller();


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

    }
}
