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
    
    public String getName(){
        return name;
    }
    public String getId(){
        return id;
    }
    public int getAge(){
        return age;
    }
    public String getMedicalHistory(){
        return medicalHistory;
    }
    
    public void setName(String name){
        this.name = name;
    }
    public void setId(String id){
        this.id = id;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setMedicalHistory(String medicalHistory){
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
            writer.write("ID: "+id+", Name: "+name+", Age: "+age+", History: "+medicalHistory);
        }catch(IOException e){
            System.out.println("Error saving patient: "+e.getMessage());
        }
    }
}
