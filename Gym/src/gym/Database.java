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
public interface Database{
    public void readFromFile();
    public void createRecordFrom(String key);
    public Entity returnAllRecords();
    public boolean contains(String key);
    public Entity getRecord(String key);
    public void insertRecord(Entity record);
    public void deleteRecord(String key);
    public void saveToFile();
}
