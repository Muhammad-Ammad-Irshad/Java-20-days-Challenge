/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.day_7;
import java.util.Scanner;
/**
 *
 * @author DELL 5410
 */
public class Day_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student name: ");
        String name = sc.nextLine();
        System.out.print("Enter roll number: ");
        int rollno = sc.nextInt();
        
        int[] marks = new int[3];
        for(int i = 0; i < 3; i++){
            System.out.println("Enter marks for subject " +(i+1)+ ": ");
            marks[i] = sc.nextInt();
        }
        
        Student s1 = new Student(name, rollno, marks);
        System.out.println("\n---Student Result---");
        s1.displayResult();
        sc.close();
    }
}
