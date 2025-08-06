/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.week_3;
import java.util.Scanner;
/**
 *
 * @author DELL 5410
 */
public class Week_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Patient p1 = new Patient("Michal", "M123", 26, "Diabetes");
        p1.saveToFile();
        
        Doctor d1 = new Doctor("Dr. Sara", "S123", "Cardiologist", true);
        
        Appointment a1 = new Appointment(p1, d1, "2025-08-04", "10:30 AM");
        a1.saveToFile();
        
        while(true){
            System.out.println("\n---Hospital Management System---");
            System.out.println("1. Search Patient");
            System.out.println("2. Delete Patient");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");
            int choose = scanner.nextInt();
            
            switch(choose){
                case 1: 
                    System.out.print("Enter Patient ID to search: ");
                    String searchId = scanner.nextLine();
                    HospitalUtils.searchPatientById(searchId);
                    break;
                case 2:
                    System.out.print("Enter Patient ID to delete: ");
                    String deleteId = scanner.nextLine();
                    HospitalUtils.deletePatientById(deleteId);
                    break;
                case 3:
                    System.out.println("Exiting..");
                    return;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
