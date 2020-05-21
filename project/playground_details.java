/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.Scanner;
import java.util.Vector;

/**
 *the class which has all the details of the playground
 * @author EGYPT_LAPTOP
 */
public class playground_details {
    public String playgroundName;
	public int  playground_size;
	public  int available_hours;
	public  float price_per_hour;
	public  int cancellation_period;
        public  String date;
	public  String link;
	public  String playground_location;

    Vector<Integer> owner = new Vector<Integer>();
    /**
	 * this function allows playground owner to add playground
         *by enter all details about his playground
         * and then store it in the system if it is approved by administrator
          * @author EGYPT_LAPTOP
          * @return playground_details to store this info
        
	 */
    
    public playground_details add_playground ()
    {
         playground_details obj1 = new playground_details() ;
         Vector<playground_details> total = new Vector<playground_details>(100);
         Scanner in = new Scanner(System.in);
         String r;
         System.out.println("enter the name of playground");//as in class playground
         r = in.nextLine();
         obj1.playgroundName = r;
         int l ;
         System.out.println("enter the beigning of avalilable period ");
          l = in.nextInt();
          obj1.owner.add(l);
          System.out.println("enter the end of availble period ");
          int s;
          s = in.nextInt();
          obj1.owner.add(s);
              System.out.println("Add the location of the playground");
                in=new Scanner (System.in);
                String location=in.nextLine();
                obj1.playground_location=location;
              
                System.out.println("Add the size of the playground");
                in=new Scanner (System.in);
                int Size=in.nextInt();
                obj1.playground_size=Size;
                         
                 System.out.println("Add the price per hour of the playground");
                in=new Scanner (System.in);
                float price=in.nextInt();
                obj1.price_per_hour=price;
                
                System.out.println("Add the cancellation period of the playground");
                in=new Scanner (System.in);
                 int period=in.nextInt();
                obj1.cancellation_period=period;
                System.out.println("Add the date of today"+"like that: 19 may 2020");
                in=new Scanner (System.in);
                 String date=in.nextLine();
                obj1.date=date;
               
          total.add(obj1);
          return obj1;
          
    }
    /**
	 * this is a set function to store playground name
        *@param playground_name to set it in the private attribute
          * @author EGYPT_LAPTOP
         
	 */
    public void setPlayground_name(String playground_name) {
		playgroundName= playground_name;
	}
     /**
	 * this is a get function to get playground name
        
          * @author EGYPT_LAPTOP
          * @return playground name
         
	 */

	public String getPlayground_name() {
		return this.playgroundName;
	}
        /**
	 * this is a set function to store playground date
          *@param datee to set it in the private attribute
          * @author EGYPT_LAPTOP
         
	 */
        public void setDate(String datee)
        {
            date= datee;
        }
        /**
	 * this is a get function to get playground date
        
          * @author EGYPT_LAPTOP
          * @return playground date
         
	 */
        public String getDate()
        {
            return this.date;
        }

	/**
	 * this is a set function to store playground size
	 * @param playground_size type integer to store in in private attribute
          * @author EGYPT_LAPTOP
	 */
	public void setPlayground_size(int playground_size) {
		this.playground_size = playground_size;
	}
        /**
	 * this is a get function to get playground size
        
          * @author EGYPT_LAPTOP
          * @return playground size
         
	 */

	public int getPlayground_size() {
		return this.playground_size;
	}

	
	/**
	 * this is a set function to store playground price per hour
	 * @param price_per_hour type integer to store in in private attribute
        * @author EGYPT_LAPTOP
	 */
	public void setPrice_per_hour(float price_per_hour) {
		this.price_per_hour = price_per_hour;
	}
/**
	 * this is a get function to get playground price per hour
        
          * @author EGYPT_LAPTOP
          * @return playground price per hour
         
	 */
	public float getPrice_per_hour() {
		return this.price_per_hour;
	}

	/**
	 * this is a set function to store playground cancellation period
	 * @param cancellation_period type integer to store in in private attribute
         *@author EGYPT_LAPTOP
	 */
	public void setCancellation_period(int cancellation_period) {
		this.cancellation_period = cancellation_period;
	}
/**
	 * this is a get function to get playground cancellation period
        
          * @author EGYPT_LAPTOP
          * @return playground cancellation period
         
	 */
	public int getCancellation_period() {
		return this.cancellation_period;
	}

	/**
	 * this is a get function to get playground link
	 * @param link type string to store in in private attribute
          *@author EGYPT_LAPTOP
	 */
	public void setLink(String link) {
		this.link = link;
	}
/**
	 * this is a get function to get playground link
        
          * @author EGYPT_LAPTOP
          * @return playground link
         
	 */
	public String getLink() {
		return this.link;
	}
        
        /**
	 * this is a set function to store playground location
	 * @param playground_location type string to store in in private attribute
          * @author EGYPT_LAPTOP
	 */
        public void setPlayground_location(String playground_location) {
		this.playground_location = playground_location;
	}
        /**
	 * this is a get function to get playground location
        
          * @author EGYPT_LAPTOP
          * @return playground location
         
	 */

	public String getPlayground_location() {
		return this.playground_location;
	}

	
	

}
