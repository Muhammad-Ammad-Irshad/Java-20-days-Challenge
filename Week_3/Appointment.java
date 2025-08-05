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
public class Appointment {
    private Patient patient;
    private Doctor doctor;
    private String date;
    private String time;
    
    public Appointment(Patient patient, Doctor doctor, String date, String time){
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
        this.time = time;
    }
    
    public Patient getPatient(){
        return patient;
    }
    public Doctor getDoctor(){
        return doctor;
    }
    public String getDate(){
        return date;
    }
    public String getTime(){
        return time;
    }
    
    public void displayInfo(){
        System.out.println("---Appointment Details---");
        System.out.println("Date: "+date);
        System.out.println("Time: "+time);
        System.out.println("Patient: "+patient.getName()+"(ID: "+patient.getId()+")");
        System.out.println("Doctor: "+doctor.getName()+"(ID: "+doctor.getId()+")");
        System.out.println("Speciality: "+doctor.getSpecialization());
        System.out.println("----------------------------------------------");
    }
    
    public void saveToFile(){
        try(FileWriter writer = new FileWriter("appointments.txt", true)){
            writer.write("Date: "+date+", Time: "+time+
                    ", Patient: "+patient.getName()+", (ID: "+patient.getId()+")"+
                    ", Doctor: "+doctor.getName()+"(ID: "+doctor.getId()+")\n");
        }catch(IOException e){
            System.out.println("Error saving appointment: "+e.getMessage());
        }
    }
}
