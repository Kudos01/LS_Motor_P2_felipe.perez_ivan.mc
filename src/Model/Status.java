package Model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Status {
    private int statusId;
    private String status;

    public Status(ResultSet rs){
        try{
            this.statusId = rs.getInt("statusId");
            this.status = rs.getString("status");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public int getStatus_id() {
        return statusId;
    }

    public void setStatus_id(int status_id) {
        this.statusId = status_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
