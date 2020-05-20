/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;



import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

/**
 * any user can login() or Register() in the system
 * @author EGYPT_LAPTOP
 */
public class User {
    private String type;
	private String name;
	private int phone;
	public String address="";
	private String Email;
	private String password;
	private String username;
	private int ID;
	private Vector<User> users = new Vector<User>();
	 Vector<playground_details>total=new Vector <playground_details>(); //having all the playgrounds info added to the system

        public void Registration() {
		
		 String email,pswd,TYPE,NAME;
		    int id,code;
		 User obj= new User();
		 Scanner input=new Scanner(System.in);
     
           
     	System.out.println("enter your gmail please");
     	input=new Scanner(System.in);
     	email=input.nextLine();
        if(email.contains("@")&& email.contains(".")&&email.contains("gmail")&& email.contains("com"))
        {
     	obj.setEmail(email);
        }
        else {System.out.println("Invalid email ,couldn't complete the registration!");
             return;}
     	System.out.println("enter your password please");
     	input=new Scanner(System.in);
     	pswd=input.nextLine();
     	obj.setPassword(pswd);
        
        System.out.println("enter your name please");
     	input=new Scanner(System.in);
     	NAME=input.nextLine();
     	obj.setName(NAME);
        
        System.out.println("enter your type of account");
     	input=new Scanner(System.in);
  	    TYPE=input.nextLine();
  	   obj.setType(TYPE);
           
     	System.out.println("enter your ID please");
     	input=new Scanner(System.in);
     	id=input.nextInt();
         obj.setID(id);
         
     	
     	System.out.println("A verification code will be sent to your email that you must re-enter");
     	input=new Scanner(System.in);
     	code=input.nextInt();
     	if(code==500)
     	{users.add(obj);
     	  System.out.println("you've been added to our system successfuly");
     	}
     	else
     		System.out.println("Registration has been expired!");
         
        for(int i=0;i<users.size();i++)
         {    
                String s=users.get(i).name;
         	System.out.println(s);
         }
       
     
	}

	public void login() {
		
                 boolean flage=true;
                 boolean flag=true;
                 int x=0;
                  boolean flagpass=true;
                  boolean flagpass2=true;
                 String email1,password1;
                  Scanner input=new Scanner(System.in);
                System.out.println("please enter your email and password to continue ");
                input = new Scanner(System.in);
                email1 = input.nextLine();
                input = new Scanner(System.in);
                password1 = input.nextLine();
                for (int b = 0; b < users.size(); b++) {
                  String emaill=users.get(b).Email;
                    if (email1.equalsIgnoreCase(emaill)) {
                        flag=false;
                        
                        for (int z = 0; z <users.size(); z++) {
                         String passwordd=users.get(z).password;
                        
                            if (password1.equalsIgnoreCase(passwordd)) {
                              flagpass=false;
                              x=b;
                               
                                if (x == -1) {
                                    System.out.println("invalid");
                                } else {
                                    String str = users.get(x).password;
                                    
                                    if (password1.equalsIgnoreCase(str)) {
                                        flagpass2=false;
                                        String t=users.get(x).type;
                                    System.out.println("Welcome "+t);
                                    
                                    
                                    if(t.equalsIgnoreCase("playground owner"))
                                    {   User obj=new User();
                                        Playground_owner p= new Playground_owner();
                                        if(users.get(x).address.isEmpty())
                                        {System.out.println("You must first create a profile to continue");
                                       obj= p.create_profile(obj);
                                        users.get(x).address= obj.address;
                                        users.get(x).phone=obj.phone;
                                        String add=users.get(x).address;
                                        int ph= users.get(x).phone;
                                        System.out.println("Your Address "+add);
                                        System.out.println("Your Phone "+ph);
                                        }
                                        boolean flagg=true;
                                        while(flagg==true)
                                        {
                                        System.out.println("Choose from the following: 1- add playground 2-exit");
                                        input=new Scanner (System.in);
                                        int c=input.nextInt();
                                        if(c==1)
                                        {
                                       total= p.add_playground();
                                       for(int i=0;i<total.size();i++) //printing the playgrounds in the system
                                         {
                                             System.out.println(total.get(i).getPlayground_name());
                                         }
                                        }
                                        else if(c==2) 
                                         
                                         return;
                                        else System.out.println("WRONG INPUT");
                                        }
                                    }
                                    else if(t.equalsIgnoreCase("player"))
                                    { boolean fl=true;
                                      int ch=0;
                                      String n;
                                      Player p=new Player(total);

                                        while(fl==true){
                                      System.out.println("Choose from the following : 1-Book a playground 2- others 3-Exit");
                                      input=new Scanner (System.in);
                                      ch=input.nextInt();
                                      if(ch==1)
                                      {
                                      
                                      System.out.println("enter the name of the playground");
                                      input=new Scanner (System.in);
                                      n=input.nextLine();
                                      p.book_time(n);
                                      
                                      }
                                      if(ch==2)
                                      {
                                           int choice=0;

                                      ArrayList <Team_Members>arr = new ArrayList <Team_Members>();
                                        
                                   while(choice<5)
                                   {
                                    System.out.println("1- create a Team\n"+"2- Modify your Team\n"+"3- Print Team INFO\n"+"4- view playgrounds\n"+"5- Exit");      
                                    Scanner c = new Scanner(System.in);
                                    choice = c.nextInt();
                                     
                                     
                                   
                                   if(choice==1)
                                   {
                                  System.out.println("how many memebr of teams");
                           	       Scanner scanner= new Scanner(System.in);
                           	       int num= scanner.nextInt();
                                          
                           	     
                              
                                   int j = 0;
                                   while (j < num) {
                                       Scanner myObj = new Scanner(System.in);  // Create a Scanner object
                                       System.out.println("enter name of " + (j + 1) + " member\n");
                                       String name = myObj.nextLine();
                                         
                                       Scanner myOb = new Scanner(System.in);  // Create a Scanner object
                                       System.out.println("enter email of " + (j + 1) + " member\n");
                                       String email = myOb.nextLine();
                                       Team_Members mem = new Team_Members();
                                       mem.setName(name);
                                      mem.setEmail(email);
                                       arr.add(j, mem);
                                       j++;
                                   }
                                  p. create_team(arr);
                                   
                                   }
                                   if(choice==2)
                                   {
                                      p. modify();
                                   }
                                   if(choice==3)
                                   {
                                  p. print_team();}
                                   
                                    if(choice==4)
                                   {  
                                        
                            
                                 p.view_playgrounds();
                                  
                                   System.out.println("Do you want to filter them?");
                                    Scanner g = new Scanner(System.in);  // Create a Scanner object
                                       System.out.println("1- YES\n"+"2- NO\n");
                                       int choo = g.nextInt();
                                      if(choo==1)
                                      { int choose=0;
                                          while(choose<6)
                                   {
                                    System.out.println("1- By Area\n"+"2- By Date \n"+"3- By specific hours\n"+"4-By price\n"+"5- Availabe hours\n"+"6- Exit");      
                                    Scanner f = new Scanner(System.in);
                                    choose = f.nextInt();
                                    if(choose==1)
                                    {
                                        System.out.println("Enter the area");
                                         Scanner ar = new Scanner(System.in);
                                        String area=ar.nextLine();
                                        p.filter(area);
                                      }
                                     if(choose==2)
                                    {
                                        System.out.println("Enter the Date "+"like that: 19 may 2020");
                                         Scanner d = new Scanner(System.in);
                                        String date =d.nextLine();
                                       p.filterdate(date);
                                      }
                                     if(choose==3)
                                    {
                                        System.out.println("Enter the hour");
                                         Scanner h = new Scanner(System.in);
                                        int hour =h.nextInt();
                                        p.filterhour(hour);
                                      }
                                      if(choose==4)
                                    {
                                        System.out.println("Enter the price");
                                         Scanner pr = new Scanner(System.in);
                                        int price=pr.nextInt();
                                        p.filterprice(price);
                                      }
                                      if(choose==5)
                                      {
                                          p.filteravailabe();
                                      }
                                     
                                    
                                   
                                   }
                                   
                                      }
                               }
                                   
                                  
                               }
                                      }
                                      else if(ch==3)
                                      return;
                                      else System.out.println("WRONG INPUT");
                                        }
                                    }
                                  
                                    }
                                   
                                      
	}      
                            }
                           
                            
                        }
                        if(flagpass2==true || flagpass==true)
                            System.out.println("Incorrect password");
                        
                    }}
                if(flag==true)
                    System.out.println("Register to the system first");
        
        }

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name type string
         * @author EGYPT_LAPTOP
	 */
	public void setName(String name) {
		this.name = name;
	}
	public void setType(String type) {
		this.type = type;
	}

	public int getPhone() {
		return this.phone;
	}

	/**
	 * 
	 * @param phone type integer
         * @author EGYPT_LAPTOP
	 */
	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return this.address;
	}

	/**
	 * 
	 * @param address type string
         * @author EGYPT_LAPTOP
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		// TODO - implement User.getEmail
	return this.Email;
	}

	/**
	 * 
	 * @param Email type string
         * @author EGYPT_LAPTOP
	 */
	public void setEmail(String Email) {
		// TODO - implement User.setEmail
		this.Email=Email;
	}

	public String getPassword() {
		return this.password;
	}

	/**
	 * 
	 * @param password type string
         * @author EGYPT_LAPTOP
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return this.username;
	}

	/**
	 * 
	 * @param username type string
         * @author EGYPT_LAPTOP
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	public int getID() {
		// TODO - implement User.getID
		return this.ID;
	}

	/**
	 * 
	 * @param ID type integer
         * @author EGYPT_LAPTOP
	 */
	public void setID(int ID) {
		// TODO - implement User.setID
		this.ID=ID;
	}

}
