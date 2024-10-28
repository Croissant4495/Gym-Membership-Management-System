/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gym;

import java.time.LocalDate;
import java.util.*;


/**
 *
 * @author Abdel
 */
public class Gym {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MemberClassRegistrationDatabase mydata = new MemberClassRegistrationDatabase("Registration.txt");
        mydata.readFromFile();
        ArrayList<MemberClassRegistration> list = mydata.returnAllRecords();
        MemberClassRegistration temp = mydata.createRecordFrom(list.get(0).LineRepresentation());
        mydata.insertRecord(temp);

        mydata.saveToFile();
    }
    
}
