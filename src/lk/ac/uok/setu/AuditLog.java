package lk.ac.uok.setu;

import java.util.Date;

/**
 * Created by Padma Gnanapiya (SE/2017/014)
 */


public class AuditLog {
    private  String id;
    private String userId;
    private Date timeStamp;
    private String actionType;
    private String resource;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }



    public String getUserId() {
        return userId;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public String getActionType() {
        return actionType;
    }

    public String getResource() {
        return resource;
    }


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

    public static class AuditLogBuilder{
        private String id;
        private String userId;
        private Date timeStamp;
        private String actionType;
        private String resource;

        //Mandatory properties of an audit log: id
        //Not mandatory :

        //Optional constructor
        public AuditLogBuilder(String id){
            this.id = id;
        }

        public AuditLogBuilder by(String user){
            this.userId = user;
            return this;
        };

        public AuditLogBuilder at(Date time){
            this.timeStamp = time;
            return this;
        };

        public AuditLogBuilder withAction(String action){
            this.actionType = action;
            return this;
        };

        public AuditLogBuilder on(String resource){
            this.resource = resource;
            return this;
        };

        public AuditLog build() {
            AuditLog auditLog= new AuditLog();
            auditLog.setId(this.id);
            auditLog.setActionType(this.actionType);
            auditLog.setUserId(this.userId);
            auditLog.setTimeStamp(this.timeStamp);
            auditLog.setResource(this.resource);
            return auditLog;
        }
    }
}
