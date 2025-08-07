/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week_3;
import java.io.*;
/**
 *
 * @author DELL 5410
 */
public class HospitalUtils {
    public static void searchPatientById(String id){
        try(BufferedReader reader = new BufferedReader(new FileReader("patients.txt"))){
            String line;
            boolean found = false;
            while((line = reader.readLine()) != null){
                if(line.contains("ID: "+id)){
                    System.out.println("Patient Found: "+line);
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.println("Patient wit ID "+id+" not found");
            }
        }catch(IOException e){
            System.out.println("Error reading file: "+e.getMessage());
        }
    }
    
    public static void deletePatientById(String id){
        File inputFile = new File("patients.txt");
        File tempFile = new File("patients_temp.txt");
        
        boolean deleted = false;
        
        try(BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))){
            String line;
            while((line = reader.readLine()) != null){
                if(!line.contains("ID: "+id)){
                    writer.write(line + System.lineSeparator());
                }else{
                    deleted = true;
                }
            }
        }catch(IOException e){
            System.out.println("Error: "+e.getMessage());
            return;
        }
        if(inputFile.delete()){
            tempFile.renameTo(inputFile);
        }
        if(deleted){
            System.out.println("Patient with ID "+id+" deleted successfully");
        }else{
            System.out.println("Patient with ID "+id+" not found");
        }
    }
}
