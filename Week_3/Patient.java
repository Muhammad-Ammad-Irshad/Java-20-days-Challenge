/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week_3;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author DELL 5410
 */
public class Patient {
    private String name;
    private String id;
    private int age;
    private String medicalHistory;
    
    public Patient(String name, String id, int age, String medicalHistory){
        this.name = name;
        this.id = id;
        this.age = age;
        this.medicalHistory = medicalHistory;
    }
    
    
    public void displayInfo(){
        System.out.println("-----------------------------");
        System.out.println("Patient ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("History: "+medicalHistory);
        System.out.println("-----------------------------");
    }
    
    public void saveToFile(){
        try(FileWriter writer = new FileWriter("patients.txt", true)){
            writer.write(toString()+"\n");
        }catch(IOException e){
            System.out.println("Error saving patient: "+e.getMessage());
        }
    }
    public String toString(){
        return "ID: "+id+", Name: "+name+", Age: "+age+", History: "+medicalHistory;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}
