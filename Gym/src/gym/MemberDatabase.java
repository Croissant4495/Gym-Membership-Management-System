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
public class MemberDatabase {

    private ArrayList<Member> records;
    private String filename;

    public MemberDatabase(String filename) {
        this.filename = filename;
        this.records = new ArrayList<>();
    }

    public void readFromFile(String filename) {
        try {
            Scanner scanner = new Scanner(new File(filename));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                Member member = createRecordFrom(line);
                records.add(member);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

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

    public ArrayList<Member> returnAllrecords() {
        return records;
    }

    public Boolean contains(String key) {
        for (int i = 0; i < records.size(); i++) {
            if (records.get(i).getSearchKey().equals(key)) {
                return true;
            }
        }

        return false;
    }

    public Member getRecord(String key) {
        Member gettingMember = null;
        for (int i = 0; i < records.size(); i++) {
            if (records.get(i).getSearchKey().equals(key)) {
                gettingMember = records.get(i);
                return gettingMember;
            }
        }
        return gettingMember;
    }

    public void insertRecord(Member record) {
        if (!records.contains(record)) {
            records.add(record);
        }
    }

    public void deleteRecord(String key) {
        for (int i = 0; i < records.size(); i++) {
            if (records.get(i).getSearchKey().equals(key)) {
                records.remove(i);
                break;
            }
        }
    }

    public void saveToFile() {
        try (BufferedWriter myWriter = new BufferedWriter(new FileWriter(this.filename))) {
            for (Member member : records) {
                myWriter.write(member.LineRepresentation());
                myWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
