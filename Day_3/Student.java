/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.day_3;

/**
 *
 * @author DELL 5410
 */
public class Student {
    private String name;
    private int age;
    private double marks;
     public Student(String name, int age, double marks){
         this.name = name;
         this.age = age;
         this.marks = marks;
     }
     public void displayDetails(){
         System.out.println("Student Details");
         System.out.println("Name: "+name);
         System.out.println("Age: "+age);
         System.out.println("Marks: "+marks);
     }
}
