/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esh.services;

import com.mysql.cj.protocol.x.Notice;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import esh.models.Hostels;
import esh.models.Notices;
import esh.models.Prolblems;
import esh.models.Requests;
import esh.models.Student;
import esh.util.DB_Connection;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Services {
    //Services services = new Services();
    //Student student = new Student();
    private static Connection connection;
    private static PreparedStatement preparedStatement;
    ResultSet resultSet;

    public void insertStudent(Student student){
        String sid = student.getRegId();
        String name = student.getName();
        String fac = student.getFaculty();
        String accyear = student.getAcedemicYear();
        String nic = student.getNic();
        String insertQuearyStudent = "INSERT INTO student(`SID`,`Name`,`Faculty`,`AccademicYear`,`NIC`) VALUES ('"+sid+"','"+name+"','"+fac+"','"+accyear+"','"+nic+"')";
        try {
            connection = new DB_Connection().getConnection();
            preparedStatement = connection.prepareStatement(insertQuearyStudent);
            boolean result = preparedStatement.execute();
            System.out.println("DB status: "+result);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
        }finally {		
                  Services.colsedConnections();
        }
}
    public void insertHostel(Hostels hostels,Student student){
        String hname = hostels.getHostalName();
        String df = hostels.getDateFrom();
        String dt = hostels.getDateTo();
        String room = hostels.getRoomNumber();
        String studentId = student.getRegId();
        
        String insertQuearyHostel = "INSERT INTO hosteldetials(`hostelName`,`datefrom`,`dateto`,`RoomNo`,`sid`)VALUES('"+hname+"','"+df+"','"+dt+"','"+room+"','"+studentId+"')";
        try {
            connection = new DB_Connection().getConnection();
            preparedStatement = connection.prepareStatement(insertQuearyHostel);
            boolean result = preparedStatement.execute();
            System.out.println("DB status: "+result);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
        }finally {		
                  Services.colsedConnections();
        }
    }
    
    public void updateHostel(Hostels hostels){
        String hid = hostels.getHid();
        String hname = hostels.getHostalName();
        String df = hostels.getDateFrom();
        String dt = hostels.getDateTo();
        String room = hostels.getRoomNumber();
        
        String updateQuearyHostel = "UPDATE hosteldetials SET `hostelName`='"+hname+"',`datefrom`='"+df+"',`dateto`='"+dt+"',`RoomNo`='"+room+"' where `hid`='"+hid+"'";
        
        try {
            connection = new DB_Connection().getConnection();
            preparedStatement = connection.prepareStatement(updateQuearyHostel);
            preparedStatement.execute();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
        }finally {		
                  Services.colsedConnections();
        }
    }
    public void deleteHostel(Hostels hostels){
        String hid = hostels.getHid();
        //String room = hostels.getRoomNumber();
        String deleteQuearyHostel = "DELETE FROM hosteldetials where `hid`='"+hid+"'";
        try {
            connection = new DB_Connection().getConnection();
            preparedStatement = connection.prepareStatement(deleteQuearyHostel);
            preparedStatement.execute();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
        }finally {		
                  Services.colsedConnections();
        }
    }
    
    public void requestHostelAdd(Hostels hostels, Requests requests){
        String ssid = hostels.getSsid();
        String hname = hostels.getHostalName();
        String df = hostels.getDateFrom();
        String dt = hostels.getDateTo();
        String room = hostels.getRoomNumber();
        
        String rid = requests.getRequestId();
        
        String insertQuearyRequest = "INSERT INTO hosteldetials(`hostelName`,`datefrom`,`dateto`,`RoomNo`,`sid`)VALUES('"+hname+"','"+df+"','"+dt+"','"+room+"','"+ssid+"')";
        String removeRequest = "DELETE FROM request where `RID`='"+rid+"'";
        try {
            connection = new DB_Connection().getConnection();
            connection.prepareStatement(insertQuearyRequest).execute();
            connection.prepareStatement(removeRequest).execute();
            //boolean result = preparedStatement.execute();
            //System.out.println("DB status: "+result);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
        }finally {		
                  Services.colsedConnections();
        }
    }
    public void updateNotice(Notices notices){
        String status = "Seen";
        String updateQuearyNotice = "UPDATE notice SET `Status`='"+status+"' where `NID`='"+notices.getNid().toString()+"'";
        try {
            connection = new DB_Connection().getConnection();
            preparedStatement = connection.prepareStatement(updateQuearyNotice);
            preparedStatement.execute();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
        }finally {		
                  Services.colsedConnections();
        }
    }
    public void updateProblem(Prolblems prolblems){
        String status = "Fixed";
        String updateQuearyNotice = "UPDATE problem SET `Status`='"+status+"' where `PID`='"+prolblems.getPid().toString()+"'";
        try {
            connection = new DB_Connection().getConnection();
            preparedStatement = connection.prepareStatement(updateQuearyNotice);
            preparedStatement.execute();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
        }finally {		
                  Services.colsedConnections();
        }
    }
    
public ResultSet tableLoadStudent(){
    String loadQueary = "SELECT * FROM student";
    try {
            connection = new DB_Connection().getConnection();
            preparedStatement = connection.prepareStatement(loadQueary);
            resultSet = preparedStatement.executeQuery();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
        }finally {		
                  //Services.colsedConnections();
        }
    return resultSet;
}
public ResultSet tableLoadHostel(){
    String loadQueary = "SELECT * FROM hosteldetials";
    try {
            connection = new DB_Connection().getConnection();
            preparedStatement = connection.prepareStatement(loadQueary);
            resultSet = preparedStatement.executeQuery();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
        }finally {		
                  //Services.colsedConnections();
        }
    return resultSet;
}
public ResultSet tableloadRequest(){
    String loadQueary = "SELECT * FROM request";
    try {
            connection = new DB_Connection().getConnection();
            preparedStatement = connection.prepareStatement(loadQueary);
            resultSet = preparedStatement.executeQuery();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
        }finally {		
                  //Services.colsedConnections();
        }
    return resultSet;
}
public ResultSet tableloadNotices(){
    String loadQueary = "SELECT * FROM notice";
    try {
            connection = new DB_Connection().getConnection();
            preparedStatement = connection.prepareStatement(loadQueary);
            resultSet = preparedStatement.executeQuery();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
        }finally {		
                  //Services.colsedConnections();
        }
    return resultSet;
}
public ResultSet tableloadProblems(){
    String loadQueary = "SELECT * FROM problem";
    try {
            connection = new DB_Connection().getConnection();
            preparedStatement = connection.prepareStatement(loadQueary);
            resultSet = preparedStatement.executeQuery();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
        }finally {		
                  //Services.colsedConnections();
        }
    return resultSet;
}
public ArrayList getStudentValues(String sid){
    String loadQueary = "SELECT * FROM student where Id = '"+sid+"'";
    Student s = new Student();
    ArrayList arr = new ArrayList();
    try {
            connection = new DB_Connection().getConnection();
            preparedStatement = connection.prepareStatement(loadQueary);
            resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                s.setName(resultSet.getString("NameOfTheApplicant"));
                s.setDob(resultSet.getString("DateOfBirth"));
                s.setAge(resultSet.getString("Age"));
                s.setNic(resultSet.getString("NationalIdentityCardNumber"));
            }else{
                JOptionPane.showMessageDialog(null, "Invalid student register id");
            }
            arr.add(s.getName());
            arr.add(s.getDob());
            arr.add(s.getAge());
            arr.add(s.getNic());
           
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
        }finally {		
                  //Services.colsedConnections();
        }
    return arr;
}
public ResultSet search(String rsid){
    String rSid = rsid;
    String loadQueary = "SELECT * FROM request where `SID` LIKE '%"+rSid+"%'";
    try {
            connection = new DB_Connection().getConnection();
            preparedStatement = connection.prepareStatement(loadQueary);
            resultSet = preparedStatement.executeQuery();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
        }finally {		
                  //Services.colsedConnections();
        }
    return resultSet;
}
public ResultSet filter_Search_viewDetails(String type,String txt){
    //String rSid = rsid;
    String loadQueary,otext="";
    if (type.equals("filtter")) {
        if(txt.equals("Hostal Name")){
            otext = "hostelName";
        }else if(txt.equals("Room Number")){
            otext = "roomnumber";
        }else if(txt.equals("Stdent Id")){
            otext = "sid";
        }else{
            otext = "hostelName";
        }
        loadQueary = "SELECT * FROM hosteldetials ORDER BY '"+otext+"' ASC";
    }else{
        loadQueary = "SELECT * FROM hosteldetials where `sid` LIKE '%"+txt+"%'";
    }
    try {
            connection = new DB_Connection().getConnection();
            preparedStatement = connection.prepareStatement(loadQueary);
            resultSet = preparedStatement.executeQuery();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
        }finally {		
                  //Services.colsedConnections();
        }
    return resultSet;
}
public ResultSet filter_Search_Notice(String type,String txt){
    //String rSid = rsid;
    String loadQueary,otext="";
    if (type.equals("filtter")) {
//        if(txt.equals("Hostal Name")){
//            otext = "hostalName";
//        }else if(txt.equals("Room Number")){
//            otext = "roomnumber";
//        }else if(txt.equals("Stdent Id")){
//            otext = "sid";
//        }else{
//            otext = "hostalName";
//        }
        loadQueary = "SELECT * FROM notice ORDER BY '"+otext+"' ASC";
    }else{
        loadQueary = "SELECT * FROM notice where `SID` LIKE '%"+txt+"%'";
    }
    try {
            connection = new DB_Connection().getConnection();
            preparedStatement = connection.prepareStatement(loadQueary);
            resultSet = preparedStatement.executeQuery();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
        }finally {		
                  //Services.colsedConnections();
        }
    return resultSet;
}
public ResultSet filter_Search_Problem(String type,String txt){
    //String rSid = rsid;
    String loadQueary,otext="";
    if (type.equals("filtter")) {
//        if(txt.equals("Hostal Name")){
//            otext = "hostalName";
//        }else if(txt.equals("Room Number")){
//            otext = "roomnumber";
//        }else if(txt.equals("Stdent Id")){
//            otext = "sid";
//        }else{
//            otext = "hostalName";
//        }
        loadQueary = "SELECT * FROM problem ORDER BY '"+otext+"' ASC";
    }else{
        loadQueary = "SELECT * FROM problem where `SID` LIKE '%"+txt+"%'";
    }
    try {
            connection = new DB_Connection().getConnection();
            preparedStatement = connection.prepareStatement(loadQueary);
            resultSet = preparedStatement.executeQuery();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);
        }finally {		
                  //Services.colsedConnections();
        }
    return resultSet;
}
public static void colsedConnections(){
                System.out.println("Connection Closed");
        try {
            if (preparedStatement != null) {
            preparedStatement.close();
            }
            if (connection != null) {
             connection.close();
            }
            }catch (SQLException e) {
		System.out.println("Connection closed error..");
	}
    } 

}
