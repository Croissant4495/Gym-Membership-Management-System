/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gym;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class MemberDatabase extends  Database<Member>{
    public MemberDatabase(String fileName){
        super(fileName);
    }
    
    @Override
    public Member createRecordFrom(String line) {
        String[] stringSplitter = line.split(",");
        String id = stringSplitter[0];
        String name = stringSplitter[1];
        String membershipType=stringSplitter[2];
        String email = stringSplitter[3];
        String phonenumber = stringSplitter[4];
        String status = stringSplitter[5];
        Member member = new Member(id, name,membershipType, email, phonenumber,status);
        return member;
    }
}
