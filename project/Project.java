/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * the main class
 * @author EGYPT_LAPTOP
 */
public class Project {

    /**
     * the main function that we run to deal with output
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
          boolean flag =true;
    User obj= new User();
	while(flag==true)
     {
         System.out.println("choose from the following: 1- REGISTER 2-lOGIN 3-Exit");
         Scanner input=new Scanner(System.in);
         int choice=input.nextInt();
         if(choice==1)
         {  
        	obj.Registration();
         }
         else if(choice==2)
         {
        	 obj.login();
         }
         else if(choice==3)
         {
             break;
         }
         else 
             System.out.println("WRONG INPUT");
     }
    }
      
}
    
    
    

