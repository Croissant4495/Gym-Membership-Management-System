/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.util.*;
import java.io.*;

/**
 *
 * @author Abdel
 */
abstract public class Database{
    private ArrayList<Entity> records;
    private String filename;

    public Database(String filename) {
        this.filename = filename;
        this.records = new ArrayList<>();
    }
    
    public void readFromFile(){
        try {
            File myFile = new File(this.filename);
            if(myFile.createNewFile()){
                System.out.println("New File created called: " + this.filename);
            }else{
                Scanner scanner = new Scanner(myFile);
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    Entity myE = createRecordFrom(line);
                    records.add(myE);
                }
            }
        } catch (IOException e) {
            System.out.println("Error occured while opening file.");
        }
    }
    
    public ArrayList<Entity> returnAllRecords(){
        return this.records;
    }
    
    public boolean contains(String key){
        for (int i = 0; i < records.size(); i++) {
            if (records.get(i).getSearchKey().equals(key)) {
                return true;
            }
        }
        return false;
    }
    
    public Entity getRecord(String key){
        for (int i = 0; i < records.size(); i++) {
            if (records.get(i).getSearchKey().equals(key)) {
                return records.get(i);
            }
        }
        return null;
    }
    
    public void insertRecord(Entity record){
        if (!this.contains(record.getSearchKey())) {
            records.add(record);
             saveToFile(); 
        }
        else
        {
            System.out.println("record already exists");
        }
    }
    
    public void deleteRecord(String key){
    Entity recorder = getRecord(key);
        if (recorder != null) {
            records.remove(recorder);
             saveToFile(); 
        } else {
            System.out.println("Record not found.");
        }
    }
    
    public void saveToFile(){
        try (BufferedWriter myWriter = new BufferedWriter(new FileWriter(this.filename))) {
            for (Entity myE : records) {
                myWriter.write(myE.LineRepresentation());
                myWriter.newLine();
            }
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
    
    abstract public Entity createRecordFrom(String line);
}
