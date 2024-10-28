/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gym;

/**
 *
 * @author Abdel
 */
public class Class implements Entity{
    private String classID, className, trainerID;
    private int duration, availableSeats;
    
    public Class(String id, String name, String trainer, int duration, int seats){
        this.classID = id;
        this.className = name;
        this.trainerID = trainer;
        this.duration = duration;
        this.availableSeats = seats;
    }
    
    public int getAvailableSeats(){
        return this.availableSeats;
    }
    
    public void setAvailableSeats(int availableSeats){
        this.availableSeats = availableSeats;
    }
    
    public String LineRepresentation(){
        String classDetails = this.classID + "," + this.className + "," + this.trainerID+","+ this.duration + "," + this.availableSeats;
        return classDetails;
    }
    
    public String getSearchKey(){
        return this.classID;
    }
    
}
