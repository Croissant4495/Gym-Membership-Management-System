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
        Scanner s = new Scanner(System.in);
        // TODO code application logic here
        AdminRole admin = new AdminRole();
        MemberClassRegistrationDatabase mydata = new MemberClassRegistrationDatabase("Registration.txt");
        mydata.readFromFile();
        ArrayList<MemberClassRegistration> list = mydata.returnAllRecords();
        MemberClassRegistration temp = mydata.createRecordFrom(list.get(0).LineRepresentation());
        mydata.insertRecord(temp);
        System.out.println(temp.LineRepresentation());
        mydata.saveToFile();
        int checker;
        System.out.println("please enter 1 for being an admin and 2 for being a trainer");
        checker = s.nextInt();
        int trainerchecker;
        s.nextLine();
        if (checker == 1) {
            while (true) {
                System.out.println("1. add Trainer");
                System.out.println("2. get list of Trainers");
                System.out.println("3. remove trainer");
                System.out.println("4.logout");
                trainerchecker = s.nextInt();
                if (trainerchecker == 1) {
                    System.out.println("please enter your trainer details");
                    System.out.println("please enter your trainer id");
                    String trainerId = s.nextLine();
                    System.out.println("please enter your trainer name");
                    String Name = s.nextLine();
                    System.out.println("please enter your trainer email");
                    String email = s.nextLine();
                    System.out.println("please enter your trainer speciality");
                    String speciality = s.nextLine();
                    System.out.println("please enter your trainer phoneNumber");
                    String phoneNumber = s.nextLine();
                    admin.addTrainer(trainerId, Name, email, speciality, phoneNumber);
                }
                if (trainerchecker == 2) {
                    ArrayList<Trainer> TrainerArray = admin.getListofTrainers();
                }
                if (trainerchecker == 3) {
                    System.out.println("please enter your Trainer Id");
                    String Id = s.nextLine();
                    admin.removeTrainer(Id);
                }
                if (trainerchecker == 4) {
                    admin.logout();
                }
            }

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

    public static void Adminloop(AdminRole admin) {
        int option = AdminMenu();
        switch (option) {

            case 1:
                addTrainer(admin);
                break;
            case 2:
                ArrayList<Trainer> ourTrainers=getlistofTrainers(admin);
                break;
            case 3:
                removetrainer(admin);
                break;
            case 4:
                logout(admin);
            default:
                System.out.println("Invalid option. Please try again.")
                break;
        }
    }

    public void addTrainer(AdminRole admin) {
        System.out.println("please enter your trainer details");
        System.out.println("please enter your trainer id");
        String trainerId = inputLine();
        System.out.println("please enter your trainer name");
        String Name = inputLine();
        System.out.println("please enter your trainer email");
        String email = inputLine();
        System.out.println("please enter your trainer speciality");
        String speciality = inputLine();
        System.out.println("please enter your trainer phoneNumber");
        String phoneNumber = inputLine();
        admin.addTrainer(trainerId, Name, email, speciality, phoneNumber);

    }
    public void getlistoftrainers(AdminRole admin)
    {
        return admin.getListofTrainers();
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
