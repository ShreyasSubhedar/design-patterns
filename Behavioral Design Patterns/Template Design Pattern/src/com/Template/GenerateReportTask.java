package com.Template;

public class GenerateReportTask {
    private AuditTrail auditTrail;


    public GenerateReportTask(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void execute() {
        auditTrail.record();
        System.out.println("Logic for Generating report");
    }
}
