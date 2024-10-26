/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gym;

/**
 *
 * @author user
 */
public class Trainer{
    private String ID;
    private String Name;
    private String email;
    private String speciality;
    private String phonenumber;

    public Trainer( String ID, String Name,String email, String speciality, String phonenumber) {
       this.ID=ID;
       this.Name=Name;
        this.email = email;
        this.speciality = speciality;
        this.phonenumber = phonenumber;
    }
    String LineRepresentation()
    {
        String TrainerDetails=this.ID+","+this.Name+","+this.email+","+this.speciality+","+this.phonenumber;
        return TrainerDetails;
               
    }
    
}
