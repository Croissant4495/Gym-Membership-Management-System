/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gym;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class TrainerDatabase {
     private ArrayList<Trainer> records;
    private String filename;

    public TrainerDatabase(String filename) {
        this.filename = filename;
       this.records = new ArrayList<>();
    }
  public void readFromFile(String filename) {
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                Trainer trainer = createRecordFrom(line);
                records.add(trainer);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace(); 
        }
    }
 public  Trainer createRecordFrom (String line)
  {
      Trainer trainer=null;
  }

   
}
