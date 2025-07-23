/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.day_5;

/**
 *
 * @author DELL 5410
 */
public class Day_5 {

    public static void main(String[] args) {
        Doctor doc = new Doctor("Dr. Ali", 37, "Cardio");
        Patient pat = new Patient("Aslam", 24, "Flu");
        
        System.out.println("Doctor Info:");
        doc.displayInfo();
        System.out.println("\nPatient Info:");
        pat.displayInfo();
    }
}
