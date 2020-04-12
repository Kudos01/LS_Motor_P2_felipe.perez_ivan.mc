import Controller.Controller;
import Model.Circuit;

import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        System.out.println("Connecting to Database...");
        if (!controller.startRemoteConnection()) System.exit(1);

        System.out.println("Getting circuits...");
        try {
            controller.loadRemoteInfo();
            for (Circuit circuit : controller.getCircuits()) System.out.println(circuit.toString());

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
