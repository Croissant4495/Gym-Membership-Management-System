/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gym;

import java.util.*;
import java.io.*;

/**
 *
 * @author user
 */
public class TrainerDatabase extends Database<Trainer>{

    public TrainerDatabase(String filename) {
        super(filename);
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
}
