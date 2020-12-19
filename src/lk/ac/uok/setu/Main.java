package lk.ac.uok.setu;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        AuditLog auditLog= new AuditLog();
        auditLog.setUserId("Padma");
        auditLog.setTimeStamp(new Date());
        auditLog.setActionType("download");
        auditLog.setResource("image.jpg");

        System.out.println(auditLog.getUserId());
        System.out.println(auditLog.getTimeStamp());
        System.out.println(auditLog.getActionType());
        System.out.println(auditLog.getResource());

        // GETTER SETTER (PATTERN)

    }
}
