/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esh.models;

public class Student {
    
    private String regId;
    private String name;
    private String dob;
    private String age;
    private String faculty;
    private String acedemicYear;
    private String nic;

    public Student() {
    }
    public Student(String regId, String name, String faculty, String acedemicYear, String nic) {
        this.regId = regId;
        this.name = name;
        this.faculty = faculty;
        this.acedemicYear = acedemicYear;
        this.nic = nic;
    }

    public String getRegId() {
        return regId;
    }

    public void setRegId(String regId) {
        this.regId = regId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getAcedemicYear() {
        return acedemicYear;
    }

    public void setAcedemicYear(String acedemicYear) {
        this.acedemicYear = acedemicYear;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    
    
   
    
    
}
