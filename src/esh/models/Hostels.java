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
public class Hostels {
    private String ssid;
    private String hid;
    private String hostalName;
    private String dateFrom;
    private String dateTo;
    private String roomNumber;
   
    public Hostels() {
    }

    public Hostels(String hostalName, String dateFrom, String dateTo, String roomNumber) {
        this.hostalName = hostalName;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.roomNumber = roomNumber;
    }

    public String getSsid() {
        return ssid;
    }

    public void setSsid(String ssid) {
        this.ssid = ssid;
    }

    
    
    public String getHid() {
        return hid;
    }

    public void setHid(String hid) {
        this.hid = hid;
    }

    public String getHostalName() {
        return hostalName;
    }

    public void setHostalName(String hostalName) {
        this.hostalName = hostalName;
    }

    public String getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
    }

    public String getDateTo() {
        return dateTo;
    }

    public void setDateTo(String dateTo) {
        this.dateTo = dateTo;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }
    
    
    
    
    
    
}
