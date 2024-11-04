/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import constants.FileNames;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class AdminRole {

    private TrainerDatabase database;

    public AdminRole() {
        this.database = new TrainerDatabase(FileNames.TRAINERS_FILE);
        this.database.readFromFile();
    }

    public void addTrainer(String trainerId, String name, String email, String specialty, String phoneNumber)
    {
        Trainer NewTrainer=new Trainer(trainerId,  name,  email,  specialty,  phoneNumber);
       database.insertRecord(NewTrainer);
        
    }
    public ArrayList<Entity> getListofTrainers()
    {
       return database.returnAllRecords();
    }
   public void removeTrainer (String key)
   {
       database.deleteRecord(key);
   }
    public void logout()
     {
         database.saveToFile();
     }
  
}
