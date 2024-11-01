/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package backend;

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
        do{
            System.out.print("Please enter 1 for being an admin and 2 for being a trainer: ");
            checker = inputNum();
            switch (checker) {
                case 1:
                    adminLoop(admin);
                    break;
                case 2:
                    trainerLoop(trainer);
                    break;
                default:
                    System.out.println("Invalid Option");
            }
        }while(checker != 1 && checker != 2);
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
    
    public static <T extends Entity> void printElements(ArrayList<T> myList){
        for(T i : myList){
            System.out.println(i.LineRepresentation());
        }
    }
    
    public static int AdminMenu() {
        System.out.println("Choose one of the following options:");
        System.out.println("1)Add Trainer");
        System.out.println("2)Get list of Trainers");
        System.out.println("3)Remove trainer");
        System.out.println("4)Logout");
        return inputNum();
    }

    public static void adminLoop(AdminRole admin) {
        int option;
        do{
            option = AdminMenu();
            switch (option) {
                case 1:
                    addTrainer(admin);
                    break;
                case 2:
                    printElements(admin.getListofTrainers());
                    break;
                case 3:
                    removetrainer(admin);
                    break;
                case 4:
                    admin.logout();
                    break;
                default:
                    System.out.println("Invalid option. ");
            }
        }while(option!=4);
    }

    public static void addTrainer(AdminRole admin) {
        System.out.println("please enter your trainer details");
        System.out.print("please enter your trainer id:");
        String trainerId = inputLine();
        System.out.print("please enter your trainer name:");
        String Name = inputLine();
        System.out.print("please enter your trainer email:");
        String email = inputLine();
        System.out.print("please enter your trainer speciality");
        String speciality = inputLine();
        System.out.print("please enter your trainer phoneNumber");
        String phoneNumber = inputLine();
        admin.addTrainer(trainerId, Name, email, speciality, phoneNumber);
    }

    public static void removetrainer(AdminRole admin) {
        System.out.println("Please enter the id of the trainer you want to remove");
        String key = inputLine();
        admin.removeTrainer(key);
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
        int option;
        do{
            option = trainerMenu();
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
        }while(option != 8);
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
