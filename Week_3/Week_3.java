/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.week_3;

/**
 *
 * @author DELL 5410
 */
public class Week_3 {

    public static void main(String[] args) {
        Patient p1 = new Patient("Michal", "P10", 26, "Diabetes");
        p1.displayInfo();
        p1.saveToFile();
        
        Doctor d1 = new Doctor("Dr. Sara", "S123", "Cardiologist", true);
        d1.displayInfo();
        
        Appointment a1 = new Appointment(p1, d1, "2025-08-04", "10:30 AM");
        a1.displayInfo();
        a1.saveToFile();
    }
}
