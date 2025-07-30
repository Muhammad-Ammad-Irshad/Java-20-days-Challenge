/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.day_12;

/**
 *
 * @author DELL 5410
 */
public class Student {
    private String name;
    private int age;
    private String grade;
    
    public Student(String name, int age, String grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    
    public String toFileString(){
        return name+","+age+","+grade;
    }
    public void display(){
        System.out.println("Name: "+name+", Age: "+age+", Grade: "+grade);
    }
    public static Student fromFileString(String line){
        String[] parts = line.split(",");
        return new Student(parts[0], Integer.parseInt(parts[1]), parts[2]);
    }
}
