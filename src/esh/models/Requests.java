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
public class Requests {
    private String requestId;

    public Requests() {
    }

    public Requests(String requestId) {
        this.requestId = requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestId() {
        return requestId;
    }
    
    
}
