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
public class MemberClassRegistrationDatabase implements Database {
    private ArrayList<MemberClassRegistration> records;
    private String filename;

    public MemberClassRegistrationDatabase(String filename) {
        this.filename = filename;
        this.records = new ArrayList<>();
    }
    
    @Override
    public void readFromFile() {
        try {
            Scanner scanner = new Scanner(new File(this.filename));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                MemberClassRegistration myReg = createRecordFrom(line);
                records.add(myReg);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not Found.");
        }
    }
    
    @Override
    public MemberClassRegistration createRecordFrom(String line) {
        String[] stringSplitter = line.split(",");
        String memberID = stringSplitter[0];
        String classID = stringSplitter[1];
        String status = stringSplitter[2];
        LocalDate regDate = LocalDate.parse(stringSplitter[3]);
        MemberClassRegistration myReg = new MemberClassRegistration(memberID, classID, status, regDate);
        return myReg;
    }
    
    @Override
    public ArrayList<MemberClassRegistration> returnAllRecords(){
        return this.records;
    }

    @Override
    public boolean contains(String key) {
        for (int i = 0; i < records.size(); i++) {
            if (records.get(i).getSearchKey().equals(key)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public MemberClassRegistration getRecord(String key) {
        for (int i = 0; i < records.size(); i++) {
            if (records.get(i).getSearchKey().equals(key)) {
                return records.get(i);
            }
        }
        return null;
    }

    @Override
    public void insertRecord(Entity record) {
        if (!records.contains((MemberClassRegistration)record)) {
            records.add((MemberClassRegistration)record);
        }
    }

    @Override
    public void deleteRecord(String key) {
        for (int i = 0; i < records.size(); i++) {
            if (records.get(i).getSearchKey().equals(key)) {
                records.remove(i);
                break;
            }
        }
    }

    @Override
    public void saveToFile() {
        try (BufferedWriter myWriter = new BufferedWriter(new FileWriter(this.filename))) {
            for (MemberClassRegistration myReg : records) {
                myWriter.write(myReg.LineRepresentation());
                myWriter.newLine();
            }
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}
