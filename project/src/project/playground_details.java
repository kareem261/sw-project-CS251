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
	private int playground_size;
	private int available_hours;
	private float price_per_hour;
	private int cancellation_period;
        private String date;
	private String link;
	public String playground_location;

    Vector<Integer> owner = new Vector<Integer>();
    
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
    public void setPlayground_name(String playground_name) {
		playgroundName= playground_name;
	}

	public String getPlayground_name() {
		return this.playgroundName;
	}
        public void setDate(String datee)
        {
            date= datee;
        }
        public String getDate()
        {
            return this.date;
        }

	/**
	 * 
	 * @param playground_size type integer
          * @author EGYPT_LAPTOP
	 */
	public void setPlayground_size(int playground_size) {
		this.playground_size = playground_size;
	}

	public int getPlayground_size() {
		return this.playground_size;
	}

	
	/**
	 * 
	 * @param price_per_hour type integer
        * @author EGYPT_LAPTOP
	 */
	public void setPrice_per_hour(float price_per_hour) {
		this.price_per_hour = price_per_hour;
	}

	public float getPrice_per_hour() {
		return this.price_per_hour;
	}

	/**
	 * 
	 * @param cancellation_period type integer
         *@author EGYPT_LAPTOP
	 */
	public void setCancellation_period(int cancellation_period) {
		this.cancellation_period = cancellation_period;
	}

	public int getCancellation_period() {
		return this.cancellation_period;
	}

	/**
	 * 
	 * @param link type string
          *@author EGYPT_LAPTOP
	 */
	public void setLink(String link) {
		this.link = link;
	}

	public String getLink() {
		return this.link;
	}
        
        /**
	 * 
	 * @param playground_location type string
          * @author EGYPT_LAPTOP
	 */
        public void setPlayground_location(String playground_location) {
		this.playground_location = playground_location;
	}

	public String getPlayground_location() {
		return this.playground_location;
	}

	
	

}
