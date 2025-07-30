/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.day_12;
import java.util.*;
import java.io.*;
/**
 *
 * @author DELL 5410
 */
public class Day_12 {

    static final String FILE_NAME = "student.txt";
    
    public static void writeStudent(Student student){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))){
            writer.write(student.toFileString());
            writer.newLine();
            System.out.println("Student added successfully");
        }catch(IOException e){
            System.out.println("Error writing to file: "+e.getMessage());
        }
    }
    public static void readStudent(){
        try(BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))){
            String line;
            while((line = reader.readLine())!= null){
                Student s = Student.fromFileString(line);
                s.display();
            }
        }catch(FileNotFoundException e){
            System.out.println("File not found. No records yet");
        }catch(IOException e){
            System.out.println("Error reading the file: "+e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("\n1. Add Student");
            System.out.println("2. View Student");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch(choice){
                case 1:
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Grade: ");
                    String grade = scanner.nextLine();
                    Student newStudent = new Student(name, age, grade);
                    writeStudent(newStudent);
                    break;
                case 2: 
                    readStudent();
                    break;
                case 3:
                    System.out.println("Exiting program..");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
