/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gym;

import java.util.*;
import java.io.*;
import java.time.LocalDate;

/**
 *
 * @author Abdel
 */
public class MemberClassRegistrationDatabase extends Database{
    
    public MemberClassRegistrationDatabase(String fileName){
        super(fileName);
    }

    @Override
    public MemberClassRegistration createRecordFrom(String line) {
        String[] stringSplitter = line.split(",");
        String memberID = stringSplitter[0];
        String classID = stringSplitter[1];
        LocalDate regDate = LocalDate.parse(stringSplitter[2]);
        String status = stringSplitter[3];
        MemberClassRegistration myReg = new MemberClassRegistration(memberID, classID, status, regDate);
        return myReg;
    }
}
