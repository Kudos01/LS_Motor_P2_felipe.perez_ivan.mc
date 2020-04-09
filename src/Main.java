import Controller.ControllerExample;
import Model.ModelExample;

import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ControllerExample mysqlController = new ControllerExample();
        ArrayList<ModelExample> modelExamples = new ArrayList<>();

        System.out.println("Connecting to Database...");
        if (!mysqlController.startRemoteConnection()) System.exit(1);

        System.out.println("Getting movies...");
        try {
            mysqlController.loadRemoteInfo(modelExamples);
            for (ModelExample modelExample : modelExamples) System.out.println(modelExample.toString());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
