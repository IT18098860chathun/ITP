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
public class Prolblems {
    
    private String pid;
    private String subject;
    private String description;
    private String status;
    private String category;
    private String sid;

    public Prolblems() {
    }

    public Prolblems(String pid, String subject, String description, String status, String category, String sid) {
        this.pid = pid;
        this.subject = subject;
        this.description = description;
        this.status = status;
        this.category = category;
        this.sid = sid;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }
    
    
    
}
