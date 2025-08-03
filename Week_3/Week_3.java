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
        
        Doctor d1 = new Doctor("Dr. Sara", "S123", "Cardiologist", true);
        d1.displayInfo();
    }
}
