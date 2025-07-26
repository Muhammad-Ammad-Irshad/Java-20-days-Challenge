/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.day_8;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author DELL 5410
 */
public class Day_8 {
    static Scanner scanner = new Scanner(System.in);
    static String filePath = "student.txt";

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        int choice;
        do{
            System.out.println("\n1. Add Student");
            System.out.println("2. Save to File");
            System.out.println("3. Load from File");
            System.out.println("4. Exit");
            System.out.println("Choose option: ");
            choice = scanner.nextInt();
            switch(choice){
                case 1:
                    students.add(addStudent());
                    break;
                case 2:
                    saveToFile(students);
                    break;
                case 3:
                    loadFromFile();
                    break;
            }
        }while(choice != 4);
    }
    public static Student addStudent(){
        scanner.nextLine();
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Roll No: ");
        int rollno = scanner.nextInt();
        System.out.println("Enter marks: ");
        double marks = scanner.nextDouble();
        return new Student(name, rollno, marks);
    }
    public static void saveToFile(ArrayList<Student> students){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))){
            for(Student s: students){
                writer.write(s.toFileString());
                writer.newLine();
            }
            System.out.println("Data saved successfully");
        }catch(IOException e){
            System.out.println("Error Writing file");
        }
    }
    public static void loadFromFile(){
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            System.out.println("\n---Student Records---");
            while((line = reader.readLine()) != null){
                Student s = Student.fromFileString(line);
                s.display();
            }
        }catch(IOException e){
            System.out.println("Error reading file");
        }
    }
}
