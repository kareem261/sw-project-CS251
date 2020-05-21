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
 * He is a player who want to login, create a profile view Available playgrounds
 * ,filtering playgrounds ,creating a team
 *
 * @author EGYPT_LAPTOP
 */
public class Player {

    private int size;
    private system sys = new system();
    private ArrayList<Team_Members> own_Team = new ArrayList<Team_Members>();

    Player() {

    }

    Player(Vector<playground_details> vect) {
        vectorr = vect;
    }
    Vector<playground_details> vectorr = new Vector<playground_details>();
    Vector<player_booking> vect = new Vector<player_booking>(50);
    Vector<Integer> bookings = new Vector<Integer>(50);

    public void deleteduplicates(Vector bookings) {

        for (int i = 0; i < bookings.size(); i++) {

            for (int j = 0; j < bookings.size(); j++) {

                if (i != j) {

                    if (bookings.elementAt(i).equals(bookings.elementAt(j))) {

                        bookings.removeElementAt(j);

                    }

                }

            }

        }
    }
    /**
 * this function allow the player to book playground by adding the time he want
 * and check if those times are available or not 
 * if available booked it else not
 * @param playground_name to search for it and book it
 * @author EGYPT_LAPTOP
 */

    public void book_time(String playground_name) {

        boolean flag_top = true;
        boolean flag8 = true;
        boolean flag9 = true;
        System.out.println();
        int v = 0;
        Scanner in = new Scanner(System.in);
        if (vect.isEmpty() == true) {
            int countt = 0;
            boolean flag = true;
            player_booking obj = new player_booking();
            for (int l = 0; l < vectorr.size(); l++) {
                if (flag9 == false) {
                    break;
                }
                countt++;
                if (playground_name.equalsIgnoreCase(vectorr.get(l).playgroundName)) {
                    obj.playground_name = playground_name;
                    int hours;
                    int booking_times;
                    System.out.println("Welcome in " + playground_name + " to book an hour you have to enter the start time of it ");
                    System.out.println();
                    System.out.println("How many hours you wanna book");
                    booking_times = in.nextInt();
                    System.out.println("Enter the start of the hours you wannna book");
                    for (int i = 0; i < booking_times; i++) {
                        v++;
                        if (v == booking_times) {
                            flag9 = false;
                        }
                        hours = in.nextInt();
                        if (hours > vectorr.get(l).owner.get(0) && hours < vectorr.get(l).owner.get(1)) {
                            obj.hours.add(hours);
                            System.out.println("You have booked an hour from " + hours + " to " + (hours + 1));

                        } else {
                            System.out.println("Play ground is not availble at that time");
                            break;
                        }

                    }
                } else {
                    if (countt == vectorr.size()) {
                        System.out.println("You have enterd a wrong playground name");
                        break;
                    }

                }

            }

            vect.add(obj);
        } else {
            player_booking obj = new player_booking();
            int booking_times;

            boolean flag3 = true;
            boolean flag4 = true;
            boolean flag5 = true;
            boolean flag6 = true;
            int z = 0;
            for (int l = 0; l < vectorr.size(); l++) {
                z++;
                if (flag4 == false) {
                    break;
                }
                if (playground_name.equalsIgnoreCase(vectorr.get(l).playgroundName)) {
                    System.out.println("Welcome in " + playground_name + " to book an hour you have to enter the start time of it");
                    System.out.println();
                    System.out.println("How many hours you wanna book");
                    booking_times = in.nextInt();
                    int hours;
                    System.out.println("Enter the start of the hours you wannna book ");
                    obj.playground_name = playground_name;
                    int count = 0;
                    for (int c = 0; c < booking_times; c++) {

                        hours = in.nextInt();
                        if (hours > vectorr.get(l).owner.get(0) && hours < vectorr.get(l).owner.get(1)) {
                            bookings.add(hours);
                            deleteduplicates(bookings);
                            flag3 = false;

                        } else {
                            System.out.println("Play ground is not availble at that time");
                            break;
                        }

                    }
                    boolean flag1 = true;
                    int x = 0;
                    for (int i = 0; i < vect.size(); i++) {
                        x++;
                        if (flag5 == false) {
                            break;
                        }
                        if (flag1 == false) {
                            break;
                        }
                        if (playground_name.equalsIgnoreCase(vect.get(i).playground_name)) {
                            for (int j = 0; j < bookings.size(); j++) {

                                int counter = 0;
                                for (int f = 0; f < vect.get(i).hours.size(); f++) {
                                    if (flag8 == false) {
                                        flag8 = true;
                                        break;
                                    }
                                    counter++;
                                    if (bookings.get(j) == vect.get(i).hours.get(f)) {
                                        System.out.println("The hour from " + bookings.get(j) + " to " + (bookings.get(j) + 1) + " is already booked");
                                        flag5 = false;
                                        flag_top = false;
                                        break;
                                    }

                                    if (counter == vect.get(i).hours.size()) {
                                        vect.get(i).hours.add(bookings.get(j));
                                        System.out.println("You have booked an hour from " + bookings.get(j) + " to " + (bookings.get(j) + 1));
                                        flag_top = false;
                                        flag8 = false;

                                    }

                                }
                            }

                        } else {
                            if (x == vect.size()) {
                                flag6 = false;
                                int counttt = 0;
                                for (int f = 0; f < booking_times; f++) {
                                    counttt++;
                                    obj.hours.add(bookings.get(f));
                                    System.out.println("You have booked an hour from " + bookings.get(f) + " to " + (bookings.get(f) + 1));
                                    if (counttt == booking_times) {
                                        flag1 = false;
                                        flag4 = false;
                                    }

                                }
                            }
                        }

                    }

                } else {

                    if (z == vectorr.size()) {
                        System.out.println("You have enterd a wrong playground name");
                        break;
                    }

                }

            }
            if (flag_top == true) {
                vect.add(obj);

            }
            bookings.clear();

        }
        System.out.println();
        System.out.println("The hours you have booked with its playgrounds name");
        for (int i = 0; i < vect.size(); i++) {
            System.out.println(vect.get(i).playground_name);
            for (int j = 0; j < vect.get(i).hours.size(); j++) {
                System.out.println(vect.get(i).hours.get(j));

            }

        }
    }

    /**
     * view all available playgrounds
     *
     * @author EGYPT_LAPTOP
     */
    public void view_playgrounds() {
   		// TODO - implement player.view_playgrounds

        for (int i = 0; i < vectorr.size(); i++) {
            System.out.println("Name: " + vectorr.get(i).getPlayground_name() + "\n Location: " + vectorr.get(i).getPlayground_location() + "\n");
            System.out.println("avilable hours: from: " + vectorr.get(i).owner.get(0) + "->" + vectorr.get(i).owner.get(1) + "\n  cancleation: " + vectorr.get(i).getCancellation_period() + "\n");
            System.out.println("Size: " + vectorr.get(i).getPlayground_size() + "\n  price per hours: " + vectorr.get(i).getPrice_per_hour() + "\n");

        }
        if (vectorr.size() == 0) {
            System.out.println("no playgrounds added");
        }
    }

    /**
     * view all available playgrounds in specific location
     *
     * @param location is a specific location
     * @author EGYPT_LAPTOP
     */
    public void view_playgrounds(String location) {
   		// TODO - implement player.view_playgrounds

        for (int i = 0; i < vectorr.size(); i++) {
            if (vectorr.get(i).getPlayground_location() == location) {
                System.out.println("Name: " + vectorr.get(i).getPlayground_name() + "\n Location: " + vectorr.get(i).getPlayground_location() + "\n");
                System.out.println("avilable hours: from: " + vectorr.get(i).owner.get(0) + "->" + vectorr.get(i).owner.get(1) + "\n  cancleation: " + vectorr.get(i).getCancellation_period() + "\n");
                System.out.println("Size: " + vectorr.get(i).getPlayground_size() + "\n  price per hours: " + vectorr.get(i).getPrice_per_hour() + "\n");
            }
        }
        if (vectorr.size() == 0) {
            System.out.println("no playgrounds added");
        }
    }

    public int send_code() {
        // TODO - implement player.send_code
        throw new UnsupportedOperationException();
    }

    /**
     * view all available playgrounds by filtering them by area
     *
     * @param ar area that playgrounds are filtered by it
     *
     * @author EGYPT_LAPTOP
     */
    public void filter(String ar) {
   		// TODO - implement player.filter

        for (int i = 0; i < vectorr.size(); i++) {
            if (vectorr.get(i).getPlayground_location().equalsIgnoreCase(ar)) {
                System.out.println("Name: " + vectorr.get(i).getPlayground_name() + "\n Location: " + vectorr.get(i).getPlayground_location() + "\n");
                System.out.println("avilable hours: from: " + vectorr.get(i).owner.get(0) + "->" + vectorr.get(i).owner.get(1) + "\n  cancleation: " + vectorr.get(i).getCancellation_period() + "\n");
                System.out.println("Size: " + vectorr.get(i).getPlayground_size() + "\n  price per hours: " + vectorr.get(i).getPrice_per_hour() + "\n");
            }
        }
        if (vectorr.size() == 0) {
            System.out.println("no playgrounds added");
        }
    }

    /**
     * view all available playgrounds by filtering them by date
     *
     * @param date date that playgrounds are filtered by it
     *
     * @author EGYPT_LAPTOP
     */
    public void filterdate(String date) {
        // TODO - implement player.filter
        /**
         * **
         */
        for (int i = 0; i < vectorr.size(); i++) {
            if (vectorr.get(i).getDate().equalsIgnoreCase(date)) {
                System.out.println("Name: " + vectorr.get(i).getPlayground_name() + "\n Location: " + vectorr.get(i).getPlayground_location() + "\n");
                System.out.println("avilable hours: from: " + vectorr.get(i).owner.get(0) + "->" + vectorr.get(i).owner.get(1) + "\n  cancleation: " + vectorr.get(i).getCancellation_period() + "\n");
                System.out.println("Size: " + vectorr.get(i).getPlayground_size() + "\n  price per hours: " + vectorr.get(i).getPrice_per_hour() + "\n");
            }
        }
        if (vectorr.size() == 0) {
            System.out.println("no playgrounds added");
        }
    }

    /**
     * view all available playgrounds by filtering them by available hours
     *
     * @author EGYPT_LAPTOP
     */
    public void filteravailabe() {

        for (int i = 0; i < vectorr.size(); i++) {
            System.out.println("Name: " + vectorr.get(i).getPlayground_name() + "\n Location: " + vectorr.get(i).getPlayground_location() + "\n");
            System.out.println("avilable hours: from: " + vectorr.get(i).owner.get(1) + "->" + vectorr.get(i).owner.get(1) + "\n  cancleation: " + vectorr.get(i).getCancellation_period() + "\n");
            System.out.println("Size: " + vectorr.get(i).getPlayground_size() + "\n  price per hours: " + vectorr.get(i).getPrice_per_hour() + "\n");
        }
        if (vectorr.size() == 0) {
            System.out.println("no playgrounds added");
        }

    }

    public void filterhour(int sp_hours) {
   		// TODO - implement player.filter

        for (int i = 0; i < vectorr.size(); i++) {
            for (int l = 0; l < vectorr.get(i).owner.size(); l++) {
                if (vectorr.get(i).owner.get(0) == sp_hours || vectorr.get(i).owner.get(1) >= sp_hours) {
                    System.out.println("Name: " + vectorr.get(i).getPlayground_name() + "\n Location: " + vectorr.get(i).getPlayground_location() + "\n");
                    System.out.println("avilable hours: from: " + vectorr.get(i).owner.get(0) + "->" + vectorr.get(i).owner.get(1) + "\n  cancleation: " + vectorr.get(i).getCancellation_period() + "\n");
                    System.out.println("Size: " + vectorr.get(i).getPlayground_size() + "\n  price per hours: " + vectorr.get(i).getPrice_per_hour() + "\n");
                }
            }
        }
        if (vectorr.size() == 0) {
            System.out.println("no playgrounds added");
        }

    }

    /**
     * view all available playgrounds by filtering them by price
     *
     * @param price_range price that playgrounds are filtered by it
     *
     * @author EGYPT_LAPTOP
     */
    public void filterprice(int price_range) {
   		// TODO - implement player.filter

        for (int i = 0; i < vectorr.size(); i++) {
            if (vectorr.get(i).getPrice_per_hour() == price_range) {
                System.out.println("Name: " + vectorr.get(i).getPlayground_name() + "\n Location: " + vectorr.get(i).getPlayground_location() + "\n");
                System.out.println("avilable hours: from: " + vectorr.get(i).owner.get(0) + "->" + vectorr.get(i).owner.get(1) + "\n  cancleation: " + vectorr.get(i).getCancellation_period() + "\n");
                System.out.println("Size: " + vectorr.get(i).getPlayground_size() + "\n  price per hours: " + vectorr.get(i).getPrice_per_hour() + "\n");
            }
        }
        if (vectorr.size() == 0) {
            System.out.println("no playgrounds added");
        }
    }

    /**
     * booking playground by add slot time and playground name id its avaliable
     * the system asked the player to pay      *
     * @param time_slot time slot
     * @param playground_name playground
     * @author EGYPT_LAPTOP
     */
    public void book_playground(String time_slot, String playground_name) {
        // TODO - implement player.book_playground
        throw new UnsupportedOperationException();
    }

    public void pay_ewallet() {
        // TODO - implement player.pay_ewallet
        throw new UnsupportedOperationException();
    }

    /**
     *
     * create team function allows a player to create a team by adding Email and
     * name of each member
     *
     * @param teams[] array of objects "Team_Members"
     * @author EGYPT_LAPTOP
     */
    public void create_team(ArrayList<Team_Members> teams) {
        // TODO - implement player.create_team
        int i;

        for (i = 0; i < teams.size(); i++) {
            if (teams.get(i).getEmail().contains("@") && teams.get(i).getEmail().contains(".") && teams.get(i).getEmail().contains("gmail") && teams.get(i).getEmail().contains("com")) {
                own_Team.add(i, teams.get(i));
                size = teams.size();

            }

        }
        if (size > 0) {
            System.out.println("team is created");
            sys.send_email("team is created");
        } else {
            System.out.println("team is NOT created");
            sys.send_email("team is NOT created");

        }

    }

    /**
     * print_team function to display team member information
     *
     * @author EGYPT_LAPTOP
     */
    public void print_team() {
        System.out.println("Team info:" + "\n ");
        for (int j = 0; j < size; j++) {
            System.out.println("Name: " + own_Team.get(j).getName() + " " + "Email: " + own_Team.get(j).getEmail() + "\n");
        }
    }

    /**
     * if there is a team you has been created you can modify it or change it
     *
     * @author EGYPT_LAPTOP
     */
    public void modify() {
   		// TODO - implement player.modify

        if (own_Team.size() > 0) {
            System.out.println(" Members\n" + "which member you wnat to modify");

            if (own_Team.size() > 0) {
                for (int j = 0; j < size; j++) {
                    System.out.println(j + 1 + "- " + "Name: " + own_Team.get(j).getName() + " " + "Email: " + own_Team.get(j).getEmail() + "\n");
                }
                if (own_Team.size() > 1) {
                    System.out.println(own_Team.size() + "- ALL");
                }
                Scanner cc = new Scanner(System.in);
                int choicee = cc.nextInt();
                boolean flag = false;
                if (choicee > 1 && choicee == own_Team.size()) {
                    int i;
                    for (i = 0; i < own_Team.size(); i++) {
                        Scanner namee = new Scanner(System.in);  // Create a Scanner object
                        System.out.println("enter name of " + (i + 1) + " member\n");
                        String name = namee.nextLine();

                        Scanner emaill = new Scanner(System.in);  // Create a Scanner object
                        System.out.println("enter email of " + (i + 1) + " member\n");
                        String email = emaill.nextLine();
                        Team_Members member = new Team_Members();
                        flag = email.contains("@") && email.contains(".") && email.contains("gmail") && email.contains("com");
                        if (flag == true) {
                            member.setName(name);
                            member.setEmail(email);
                            own_Team.add(i, member);
                        }

                    }
                    if (i >= own_Team.size() && flag == true) {
                        System.out.println("team is modified");
                    } else {
                        System.out.println("team is NOT modified\nGmails are wrong");
                    }
                } else {
                    Scanner namee = new Scanner(System.in);  // Create a Scanner object
                    System.out.println("enter name of " + ((choicee - 1) + 1) + " member\n");
                    String name = namee.nextLine();

                    Scanner emaill = new Scanner(System.in);  // Create a Scanner object
                    System.out.println("enter email of " + ((choicee - 1) + 1) + " member\n");
                    String email = emaill.nextLine();
                    Team_Members member = new Team_Members();
                    if (email.contains("@") && email.contains(".") && email.contains("gmail") && email.contains("com")) {
                        member.setName(name);
                        member.setEmail(email);
                        own_Team.add(choicee - 1, member);
                        System.out.println("team is modified");
                    } else {
                        System.out.println("team is NOT modified\n Gmails are wrong");
                    }

                }
            }
        } else {
            System.out.println("you have " + own_Team.size());
        }
    }

    /**
     *
     * @param teams array list
     * @author EGYPT_LAPTOP
     */
    public void send_invitation(ArrayList<Team_Members> teams) {
        // TODO - implement player.send_invitation
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param players players
     * @author EGYPT_LAPTOP
     */
    public void send_invitation(Player[] players) {
        // TODO - implement player.send_invitation
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param players array
     * @param teams Array list
     * @author EGYPT_LAPTOP
     */
    public void send_invitation(Player[] players, ArrayList<Team_Members> teams) {
        // TODO - implement player.send_invitation
        throw new UnsupportedOperationException();
    }

    public void cancel_booking() {
        // TODO - implement player.cancel_booking
        throw new UnsupportedOperationException();
    }

}