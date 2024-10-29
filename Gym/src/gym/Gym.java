/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gym;

import java.util.*;
import java.time.LocalDate;

/**
 *
 * @author Abdel
 */
public class Gym {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        AdminRole admin = new AdminRole();
        TrainerRole trainer = new TrainerRole();
        int checker;
        System.out.println("please enter 1 for being an admin and 2 for being a trainer");
        checker = inputNum();
        switch (checker) {
            case 1:
                adminLoop(admin);
                break;
            case 2:
                trainerLoop(trainer);
                break;
            default:

        }
    }

    public static int AdminMenu() {
        System.out.println("Choose one of the following options:");
        System.out.println("1. add Trainer");
        System.out.println("2. get list of Trainers");
        System.out.println("3. remove trainer");
        System.out.println("4.logout");
        return inputNum();
    }

    public static void adminLoop(AdminRole admin) {
        int option;
        boolean x = true;
        while (x) {
            option = AdminMenu();
            switch (option) {

                case 1:
                    addTrainer(admin);
                    break;
                case 2:
                    ArrayList<Trainer> ourTrainers = getlistoftrainers(admin);
                    break;
                case 3:
                    removetrainer(admin);
                    break;
                case 4:
                    logout(admin);
                default:
                    System.out.println("Invalid option. ");
                    x = false;
            }
        }

    }

    public static void addTrainer(AdminRole admin) {
        System.out.println("please enter your trainer details");
        System.out.println("please enter your trainer id:");
        String trainerId = inputLine();
        System.out.println("please enter your trainer name:");
        String Name = inputLine();
        System.out.println("please enter your trainer email:");
        String email = inputLine();
        System.out.println("please enter your trainer speciality");
        String speciality = inputLine();
        System.out.println("please enter your trainer phoneNumber");
        String phoneNumber = inputLine();
        admin.addTrainer(trainerId, Name, email, speciality, phoneNumber);

    }

    public static ArrayList<Trainer> getlistoftrainers(AdminRole admin) {
        return admin.getListofTrainers();
    }

    public static void removetrainer(AdminRole admin) {
        System.out.println("please enter the id of the trainer you want to remove");
        String key = inputLine();
        admin.removeTrainer(key);
    }

    public static void logout(AdminRole admin) {
        admin.logout();
    }

    public static int inputNum() {
        Scanner myScan = new Scanner(System.in);
        return Integer.parseInt(myScan.nextLine().replaceAll(" ", ""));
    }

    public static double inputNumD() {
        Scanner myScan = new Scanner(System.in);
        return Double.parseDouble(myScan.nextLine().replaceAll(" ", ""));
    }

    public static String inputLine() {
        Scanner myScan = new Scanner(System.in);
        return myScan.nextLine().trim();
    }

    public static int trainerMenu() {
        System.out.println("Choose one of the following options:");
        System.out.println("1)Add Member");
        System.out.println("2)Get list of Members");
        System.out.println("3)Add Class");
        System.out.println("4)Get list of Classes");
        System.out.println("5)Register Member for Class");
        System.out.println("6)Cancel Registration");
        System.out.println("7)Get list of Registeration");
        System.out.println("8)Logout");
        return inputNum();
    }

    public static void trainerLoop(TrainerRole myT) {
        int option = trainerMenu();
        switch(option){
            case 1:
                addMember(myT);
                break;
            case 2:
                printElements(myT.getListOfMembers());
                break;
            case 3:
                addClass(myT);
                break;
            case 4:
                printElements(myT.getListOfClasses());
                break;
            case 5:
                registerForClass(myT);
                break;
            case 6:
                cancelReg(myT);
                break;
            case 7:
                printElements(myT.getListOfRegistration());
                break;
            case 8:
                myT.logout();
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
    
    public static void addMember(TrainerRole myT){
        System.out.println("Enter Member details:");
        System.out.print("Member ID: ");
        String MemberID = inputLine();
        System.out.print("Name: ");
        String name = inputLine();
        System.out.print("Membership Type: ");
        String membershipType = inputLine();
        System.out.print("Email: ");
        String email = inputLine();
        System.out.print("Phone Number: ");
        String number = inputLine();
        System.out.print("Status: ");
        String status = inputLine();
        myT.addMember(MemberID, name, membershipType, email, number, status);
    }
    
    public static <T extends Entity> void printElements(ArrayList<T> myList){
        for(T i : myList){
            System.out.println(i.LineRepresentation());
        }
    }
    
    public static void addClass(TrainerRole myT){
        System.out.println("Enter Class details:");
        System.out.print("Class ID: ");
        String classID = inputLine();
        System.out.print("Name: ");
        String name = inputLine();
        System.out.print("Trainer ID: ");
        String trainerID = inputLine();
        System.out.print("Duration: ");
        int duration = inputNum();
        System.out.print("Available Seats: ");
        int seats = inputNum();
        myT.addClass(classID, name, trainerID, duration, seats);
    }
    
    public static void registerForClass(TrainerRole myT){
        System.out.println("Enter Registration details:");
        System.out.print("Member ID: ");
        String MemberID = inputLine();
        System.out.print("Class ID: ");
        String classID = inputLine();
        myT.registerMemberForClass(MemberID, classID, LocalDate.now());
    }
    
    public static void cancelReg(TrainerRole myT){
        System.out.println("Enter your ID and the Class you want to cancel:");
        System.out.print("Member ID: ");
        String MemberID = inputLine();
        System.out.print("Class ID: ");
        String classID = inputLine();
        myT.cancelRegistration(MemberID, classID);
    }
}
