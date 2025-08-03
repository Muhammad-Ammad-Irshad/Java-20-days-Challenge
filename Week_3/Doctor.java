/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week_3;

/**
 *
 * @author DELL 5410
 */
public class Doctor {
    private String name;
    private String id;
    private String specialization;
    private boolean isAvailable;
    
    public Doctor(String name, String id, String specialization, boolean isAvailable){
        this.name = name;
        this.id = id;
        this.specialization = specialization;
        this.isAvailable = isAvailable;
    }
    
    public String getName(){
        return name;
    }
    public String getId(){
        return id;
    }
    public String getSpecialization(){
        return specialization;
    }
    public boolean isAvailable(){
        return isAvailable;
    }
    
    public void setName(String name){
        this.name = name;
    }
    public void setId(String id){
        this.id = id;
    }
    public void setSpecialization(String specialization){
        this.specialization = specialization;
    }
    public void setAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
    }
    
    public void displayInfo(){
        System.out.println("------------------------------");
        System.out.println("Doctor ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Specialization: "+specialization);
        System.out.println("Available: "+(isAvailable ? "Yes" : "No"));
        System.out.println("------------------------------");
    }
}
