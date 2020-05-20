/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 * class that only has the main information of the team members "Email,Name"
 * @author EGYPT_LAPTOP
 */
public class Team_Members {
    private String name;
	private String email;
	public void setName(String n) {
		this.name=n;
	}
	public void setEmail(String e) {
		this.email=e;
	}
	public String getName(){
		return name;
	}
	public String getEmail(){
		return email;
	}
    
}
