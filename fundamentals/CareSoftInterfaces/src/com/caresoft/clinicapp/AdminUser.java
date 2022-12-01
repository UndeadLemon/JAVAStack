package com.caresoft.clinicapp;


import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantAdmin, HIPAACompliantUser {
//... imports class definition...
    
    // Inside class:
    private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents;
    public boolean assignPin(int Pin) {
    	if(Pin < 100000 || Pin > 999999) {
    		return false;
    	}
    	else {
    		this.setPin(Pin);
    		return true;
    	}
    }
    public boolean accessAuthorized(Integer ID) {
    	if(this.getId().equals(ID)) {
    		return true;
    	}
    	else {
    		this.authIncident();
    		return false;
    	}
    }

    // TO DO: Implement a constructor that takes an ID and a role
    public AdminUser(Integer ID, String empRole) {
    	super(ID);
    	this.role = empRole; 	
    	this.securityIncidents = new ArrayList<String>();
    	
    }
    // TO DO: Implement HIPAACompliantUser!
    // TO DO: Implement HIPAACompliantAdmin!
    
    public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }
    public Integer getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public ArrayList<String> getSecurityIncidents() {
		return securityIncidents;
	}
	public void setSecurityIncidents(ArrayList<String> securityIncidents) {
		this.securityIncidents = securityIncidents;
	}
	public ArrayList<String> reportSecurityIncidents(){
    	return this.securityIncidents;
    }
    // TO DO: Setters & Getters

}
