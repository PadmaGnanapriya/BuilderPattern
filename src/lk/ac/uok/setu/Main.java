package lk.ac.uok.setu;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // GETTER SETTER (PATTERN)
        AuditLog auditLog= new AuditLog();
        auditLog.setUserId("Padma");
        auditLog.setTimeStamp(new Date());
        auditLog.setActionType("download");
        auditLog.setResource("image.jpg");

        System.out.println(auditLog.getUserId());
        System.out.println(auditLog.getTimeStamp());
        System.out.println(auditLog.getActionType());
        System.out.println(auditLog.getResource());



        //Some properties are optional.
        //Some properties are mandatory.


        //Builder pattern
        AuditLog auditLog1 = new AuditLog.AuditLogBuilder("123")
                .at(new Date())
                .by("Gnanapriya")
                .on("Image.jpg")
                .withAction("Download")
                .build();

        System.out.println(auditLog1.getId());

    }


}
