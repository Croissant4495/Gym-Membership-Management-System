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
abstract public class Database<T extends Entity>{
    private ArrayList<T> records;
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
                    T myE = createRecordFrom(line);
                    records.add(myE);
                }
            }
        } catch (IOException e) {
            System.out.println("Error occured while opening file.");
        }
    }
    
    public ArrayList<T> returnAllRecords(){
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
    
    public void insertRecord(T record){
        if (!this.contains(record.getSearchKey())) {
            records.add(record);
        }
    }
    
    public void deleteRecord(String key){
        for (int i = 0; i < records.size(); i++) {
            if (records.get(i).getSearchKey().equals(key)) {
                records.remove(i);
                break;
            }
        }
    }
    public void saveToFile(){
        try (BufferedWriter myWriter = new BufferedWriter(new FileWriter(this.filename))) {
            for (T myE : records) {
                myWriter.write(myE.LineRepresentation());
                myWriter.newLine();
            }
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
    
    abstract public T createRecordFrom(String line);
}
