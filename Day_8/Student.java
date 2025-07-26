/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.day_8;

/**
 *
 * @author DELL 5410
 */
class Student {
    private String name;
    private int rollno;
    private double marks;
    
    public Student(String name, int rollno, double marks){
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }
    public String toFileString(){
        return name+","+rollno+","+marks;
    }
    public static Student fromFileString(String line){
        String[] parts = line.split(",");
        return new Student(parts[0], Integer.parseInt(parts[1]), Double.parseDouble(parts[2]));
    }
    
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Roll NO: "+rollno);
        System.out.println("Marks: "+marks);
        System.out.println("-------------------");
    }
}
