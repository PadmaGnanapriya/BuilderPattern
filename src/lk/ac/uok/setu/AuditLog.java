package lk.ac.uok.setu;

import javax.swing.text.Style;
import java.util.Date;

/**
 * Created by Padma Gnanapiya (SE/2017/014)
 */


public class AuditLog {
    private String userId;
    private Date timeStamp;
    private String actionType;
    private String resource;

    public void setUserId(String id){
        this.userId= id;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }
}
