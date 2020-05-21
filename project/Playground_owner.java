/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.Scanner;
import java.util.Vector;

/**
 *in specific time slot by selecting it and paying for it using his eWallet. Both payer and owner get a notification of the booking.
 * The booked hour is not available for booking by any other player.
 * @author EGYPT_LAPTOP
 */
public class Playground_owner {
  private playground_details play_ground;
        Vector<playground_details>total=new Vector <playground_details>(); //having all the playgrounds info added to the system
	/**
	 * 
	 * @param profile type user to create a profile by adding the address and the phone number
          * @author EGYPT_LAPTOP
          * @return user object to save it
	 */
	public User create_profile(User profile) {
		// TODO - implement Playground_owner.create_profile
	String location;
        int PHONE;
         User obj= new User();
        System.out.println("enter your phone number please");
     	Scanner input=new Scanner(System.in);
     	PHONE=input.nextInt();
     	obj.setPhone(PHONE);
        
     	System.out.println("enter your default location please");
     	input=new Scanner(System.in);
     	location=input.nextLine();
     	obj.setAddress(location);
        
        System.out.println("You have created a profile successfully");
        return obj;
        
	}
        /**
	 * this function allows playground owner to add playground
         * by calling object from playground_details class
         * and if the playground approved b y the administrator the add it else 
         * tell the playground owner incorrect information and it is disapproved
          * @author EGYPT_LAPTOP
          * @return vector of playground_details objects to save it
	 */

	public Vector<playground_details> add_playground() {
	    Administrator a=new Administrator();
            playground_details obj1=new playground_details();
            
             obj1=obj1.add_playground();
             if(a.Approve_playgrounds(obj1))
             {             
                 total.add(obj1);
                 System.out.println("playground is added successfully");
             
             }
             else System.out.println("Incorrect info, playground was disapproved");
           
            
            return total;
	}

	public void update_playground() {
		// TODO - implement Playground_owner.update_playground
		
	}

	public void view_bookings() {
		// TODO - implement Playground_owner.view_bookings
		
	}

	public void check_ewallet() {
		// TODO - implement Playground_owner.check_ewallet
		
	}

	public Playground_owner() {
		// TODO - implement Playground_owner.Playground_owner
		
	}

	/**
	 * 
	 * @param profile type user
          *@author EGYPT_LAPTOP
	 */
	public Playground_owner(User profile) {
		// TODO - implement Playground_owner.Playground_owner
		
	}

}
