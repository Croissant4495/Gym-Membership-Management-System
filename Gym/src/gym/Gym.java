/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gym;

import java.time.LocalDate;
import java.util.*;

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

    }

}
