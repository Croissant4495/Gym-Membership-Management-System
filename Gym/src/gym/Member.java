/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gym;

/**
 *
 * @author user
 */
public class Member implements Entity {
    private String memberId;
    private String name;
    private String membershipType;
    private String email;
    private String phoneNumber;
    private String status;

    public Member(String memberId, String name, String membershipType, String email, String phoneNumber, String Status) {
        this.memberId = memberId;
        this.name = name;
        this.membershipType = membershipType;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.status = Status;
    }
    public String LineRepresentation() {
        String MemberDetails = this.memberId + "," + this.name + "," + this.membershipType+","+ this.email + "," + this.phoneNumber + "," + this.status;
        return MemberDetails;

    }
     public String getSearchKey()
    {
        return this.memberId;
    }
    
}
