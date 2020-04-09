import Controller.ControllerExample;
import Model.Circuit;

import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ControllerExample mysqlController = new ControllerExample();
        ArrayList<Circuit> circuits = new ArrayList<>();

        System.out.println("Connecting to Database...");
        if (!mysqlController.startRemoteConnection()) System.exit(1);

        System.out.println("Getting circuits...");
        try {
            mysqlController.loadRemoteInfo(circuits);
            for (Circuit circuit : circuits) System.out.println(circuit.toString());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
