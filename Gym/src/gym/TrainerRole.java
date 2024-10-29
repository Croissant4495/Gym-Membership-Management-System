/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gym;

import java.util.*;
import java.time.LocalDate;

/**
 *
 * @author Abdel
 */
public class TrainerRole {
    
    private MemberDatabase memberDatabase;
    private ClassDatabase classDatabase;
    private MemberClassRegistrationDatabase registrationDatabase;
    
    public TrainerRole(){
        this.memberDatabase = new MemberDatabase("Members.txt");
        this.classDatabase = new ClassDatabase("Class.txt");
        this.registrationDatabase = new MemberClassRegistrationDatabase("Registration.txt");
        
        this.memberDatabase.readFromFile();
        this.classDatabase.readFromFile();
        this.registrationDatabase.readFromFile();
    }
    
    public void addMember(String memberID, String name, String membershipType, String email, String phoneNumber, String status){
        if(!this.memberDatabase.contains(memberID)){
            this.memberDatabase.insertRecord(new Member(memberID, name, membershipType, email, phoneNumber, status));
        }
    }
    
    public ArrayList<Entity> getListOfMembers(){
        return this.memberDatabase.returnAllRecords();
    }
    
    public void addClass (String classID, String className, String trainerID, int duration, int maxParticipants){
        if(!this.classDatabase.contains(classID)){
            this.classDatabase.insertRecord(new Class(classID, className, trainerID, duration, maxParticipants));
        }
    }
    
    public ArrayList<Entity> getListOfClasses(){
        return this.classDatabase.returnAllRecords();
    }
    
    public boolean registerMemberForClass(String memberID, String classID, LocalDate registrationDate){
        if(this.classDatabase.contains(classID)){
            Class tempClass = (Class)this.classDatabase.getRecord(classID);
            if(tempClass.getAvailableSeats() > 0){
                this.registrationDatabase.insertRecord(new MemberClassRegistration(memberID, classID, "active", registrationDate));
                tempClass.setAvailableSeats(tempClass.getAvailableSeats() - 1);
                return true;
            }else{
                System.out.println("The class is full.");
                return false;
            }
        }else{
            System.out.println("This class does not exist.");
            return false;
        }
    }
    
    public boolean cancelRegistration(String memberID, String classID){
        String searchKey = memberID + classID;
        if(this.registrationDatabase.contains(searchKey)){
            MemberClassRegistration tempReg = (MemberClassRegistration)this.registrationDatabase.getRecord(searchKey);
            if(tempReg.getRegistrationDate().isBefore(LocalDate.now().plusDays(3))){
                tempReg.setRegistrationStatus("canceled");
                Class tempClass = (Class)this.classDatabase.getRecord(tempReg.getClassID());
                tempClass.setAvailableSeats(tempClass.getAvailableSeats() + 1);
                return true;
            }else{
                System.out.println("More than 3 days have passed, Cancellation failed.");
                return false;
            }
        }else{
            System.out.println("No registration was made.");
            return false;
        }
    }
    
    public ArrayList<Entity> getListOfRegistration(){
        return this.registrationDatabase.returnAllRecords();
    }
    
    public void logout(){
        this.memberDatabase.saveToFile();
        this.classDatabase.saveToFile();
        this.registrationDatabase.saveToFile();
    }
    
}
