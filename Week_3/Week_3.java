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
        boolean running = true;
        
        while(running){
            System.out.println("\n---Hospital Management System---");
            System.out.println("1. Add Patient");
            System.out.println("2. Search Patient by ID");
            System.out.println("3. Delete Patient by ID");
            System.out.println("4. Create Appointment");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            
            String choice = scanner.nextLine();
            
            switch(choice){
                case "1":
                    System.out.println("Enter Patient Name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter Patient ID: ");
                    String id = scanner.nextLine();
                    System.out.println("Enter Age: ");
                    int age = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter Maedical History: ");
                    String history = scanner.nextLine();
                    
                    Patient p = new Patient(name, id, age, history);
                    p.displayInfo();
                    p.saveToFile();
                    break;
                case "2":
                    System.out.print("Enter Patient ID to search: ");
                    String searchId = scanner.nextLine();
                    HospitalUtils.searchPatientById(searchId);
                    break;
                case "3":
                    System.out.print("Enter patient ID to delete: ");
                    String deleteId = scanner.nextLine();
                    HospitalUtils.deletePatientById(deleteId);
                    break;
                case "4":
                    System.out.print("Enter Patient Name: ");
                    String pname = scanner.nextLine();
                    System.out.print("Enter Patient ID: ");
                    String pid = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int page = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter Medical History: ");
                    String phistory = scanner.nextLine();
                    Patient newPatient = new Patient(pname, pid, page, phistory);

                    System.out.print("Enter Doctor Name: ");
                    String dname = scanner.nextLine();
                    System.out.print("Enter Doctor ID: ");
                    String did = scanner.nextLine();
                    System.out.print("Enter Specialization: ");
                    String specialization = scanner.nextLine();
                    System.out.print("Is Doctor Available? (true/false): ");
                    boolean available = Boolean.parseBoolean(scanner.nextLine());
                    Doctor newDoctor = new Doctor(dname, did, specialization, available);

                    System.out.print("Enter Appointment Date (YYYY-MM-DD): ");
                    String date = scanner.nextLine();
                    System.out.print("Enter Time (e.g. 10:30 AM): ");
                    String time = scanner.nextLine();

                    Appointment appointment = new Appointment(newPatient, newDoctor, date, time);
                    appointment.displayInfo();
                    appointment.saveToFile();
                    break;


                case "5":
                    running = false;
                    System.out.println("Exiting system. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

        scanner.close();
    }
}
