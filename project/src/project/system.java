/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.time.Clock;

/**
 *is the system which can talk other system to check the validations of items or send code to other systems
 * or send booking notification to classes in the system
 * @author EGYPT_LAPTOP
 */
public class system {
   protected int verification_code;

		/**
		 * 
		 * @param password enter password
		 * @param email enter email
                 * @author EGYPT_LAPTOP
		 */
		public void  verification(String password, String email) {
			// TODO - implement System.verification
			throw new UnsupportedOperationException();
                        
		}

		/**
		 * 
		 * @param phone_number type integer
                 * @author EGYPT_LAPTOP
		 */
		public void profile_verification(int phone_number) {
			// TODO - implement System.profile_verification
			throw new UnsupportedOperationException();
		}

		public void booking_notification() {
			// TODO - implement System.booking_notification
			throw new UnsupportedOperationException();
		}
		public int send_code() {
			// TODO - implement player.send_code
			throw new UnsupportedOperationException();
		}
                /**
		 * sending email to the team members
		 * @param s the message that the "team is created"
                 * @author EGYPT_LAPTOP
		 */
		 public void send_email(String s)
		   {  if(s=="team is created")
                        { System.out.println("emails are sent");
                            }
                   else
                   {
                       System.out.println("emails are NOT sent\n Invalid Gmails");
                   }
                   }

}
