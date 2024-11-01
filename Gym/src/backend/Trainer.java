/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 *
 * @author user
 */
public class Trainer implements Entity {

    private String trainerId;
    private String name;
    private String email;
    private String speciality;
    private String phoneNumber;

    public Trainer(String trainerId, String name, String email, String speciality, String phoneNumber) {
        this.trainerId = trainerId;
        this.name = name;
        this.email = email;
        this.speciality = speciality;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String LineRepresentation() {
        String TrainerDetails = this.trainerId + "," + this.name + "," + this.email + "," + this.speciality + "," + this.phoneNumber;
        return TrainerDetails;

    }
    
    @Override
    public String getSearchKey()
    {
        return this.trainerId;
    }

}
