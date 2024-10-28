/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gym;

import java.util.*;
import java.io.*;

/**
 *
 * @author Abdel
 */
public class ClassDatabase implements Database {
    
    private ArrayList<Class> records;
    private String filename;

    public ClassDatabase(String filename) {
        this.filename = filename;
        this.records = new ArrayList<>();
    }

    @Override
    public void readFromFile() {
        try {
            Scanner scanner = new Scanner(new File(this.filename));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                Class myClass = createRecordFrom(line);
                records.add(myClass);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not Found.");
        }
    }
    
    @Override
    public Class createRecordFrom(String line) {
        String[] stringSplitter = line.split(",");
        String id = stringSplitter[0];
        String name = stringSplitter[1];
        String trainerID = stringSplitter[2];
        int duration = Integer.parseInt(stringSplitter[3]);
        int seats = Integer.parseInt(stringSplitter[4]);
        Class myClass = new Class(id, name, trainerID, duration, seats);
        return myClass;
    }
    
    @Override
    public ArrayList<Class> returnAllRecords(){
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
    public Class getRecord(String key) {
        for (int i = 0; i < records.size(); i++) {
            if (records.get(i).getSearchKey().equals(key)) {
                return records.get(i);
            }
        }
        return null;
    }

    @Override
    public void insertRecord(Entity record) {
        if (!records.contains((Class)record)) {
            records.add((Class)record);
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
            for (Class myClass : records) {
                myWriter.write(myClass.LineRepresentation());
                myWriter.newLine();
            }
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}

