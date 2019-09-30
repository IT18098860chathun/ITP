/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esh.models;

/**
 *
 * @author ESHAN
 */
public class Notices {
    
    private String nid;
    private String leave_date;
    private String return_date;
    private String description;
    private String status;
    private String sid;
    private String subject;

    public Notices() {
    }

    public Notices(String nid, String leave_date, String return_date, String description, String status, String sid, String subject) {
        this.nid = nid;
        this.leave_date = leave_date;
        this.return_date = return_date;
        this.description = description;
        this.status = status;
        this.sid = sid;
        this.subject = subject;
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public String getLeave_date() {
        return leave_date;
    }

    public void setLeave_date(String leave_date) {
        this.leave_date = leave_date;
    }

    public String getReturn_date() {
        return return_date;
    }

    public void setReturn_date(String return_date) {
        this.return_date = return_date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    
    
    
    
}
