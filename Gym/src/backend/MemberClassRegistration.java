/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.util.*;
import java.time.LocalDate;

/**
 *
 * @author Abdel
 */
public class MemberClassRegistration implements Entity{
    private String memberId;
    private String classID;
    private String status;
    private LocalDate registrationDate;

    public MemberClassRegistration(String memberId, String classID, String status, LocalDate regDate) {
        this.memberId = memberId;
        this.classID = classID;
        this.status = status;
        this.registrationDate = regDate;
    }

    public String getMemberId() {
        return this.memberId;
    }

    public String getClassID() {
        return this.classID;
    }

    public LocalDate getRegistrationDate() {
        return this.registrationDate;
    }
    
    public void setRegistrationStatus(String newStatus){
        this.status = newStatus;
    }
    
    public String LineRepresentation() {
        String RegistrationDetails = this.memberId + "," + this.classID + "," + this.registrationDate.toString() + ","+ this.status;
        return RegistrationDetails;

    }
     public String getSearchKey()
    {
        return this.memberId + this.classID;
    }
    
    
}
