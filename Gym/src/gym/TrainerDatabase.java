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
public class TrainerDatabase {

    private ArrayList<Trainer> records;
    private String filename;

    public TrainerDatabase(String filename) {
        this.filename = filename;
        this.records = new ArrayList<>();
    }

    public void readFromFile(String filename) {
        try {
            Scanner scanner = new Scanner(new File(filename));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                Trainer trainer = createRecordFrom(line);
                records.add(trainer);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Trainer createRecordFrom(String line) {

        String[] stringSplitter = line.split(",");
        String id = stringSplitter[0];
        String name = stringSplitter[1];
        String email = stringSplitter[2];
        String speciality = stringSplitter[3];
        String phonenumber = stringSplitter[4];
        Trainer trainer = new Trainer(id, name, email, speciality, phonenumber);
        return trainer;
    }

    public ArrayList<Trainer> returnAllrecords() {
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

    public Trainer getRecord(String key) {
        Trainer gettingTrainer = null;
        for (int i = 0; i < records.size(); i++) {
            if (records.get(i).getSearchKey().equals(key)) {
                gettingTrainer = records.get(i);
                return gettingTrainer;
            }
        }
        return gettingTrainer;
    }

    public void insertRecord(Trainer record) {
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
            for (Trainer trainer : records) {
                myWriter.write(trainer.LineRepresentation());
                myWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
