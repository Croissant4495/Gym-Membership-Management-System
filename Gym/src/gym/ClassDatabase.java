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
public class ClassDatabase extends Database<Class> {

    public ClassDatabase(String fileName) {
        super(fileName);
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
}

