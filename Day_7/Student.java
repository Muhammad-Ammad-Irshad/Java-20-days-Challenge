/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.day_7;

/**
 *
 * @author DELL 5410
 */
public class Student {
    private String name;
    private int rollno;
    private int[] marks = new int[3];
    
    public Student(String name, int rollno, int[] marks){
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }
    public int getTotalMarks(){
        int sum = 0;
        for(int mark : marks){
            sum += mark;
        }
        return sum;
    }
    public double getAverage(){
        return getTotalMarks()/ 3.0;
    }
    public String getGrade(){
        double avg = getAverage();
        if(avg >= 80) return "A";
        else if(avg >= 70) return "B";
        else if(avg >= 60) return "C";
        else if(avg >= 50) return "D";
        else return "F";
    }
    public boolean isPassed(){
        for(int mark : marks){
            if(mark < 40) return false;
        }
        return true;
    }
    public void displayResult(){
        System.out.println("Name: "+name);
        System.out.println("Roll No: "+rollno);
        System.out.println("Total Marks: "+getTotalMarks());
        System.out.println("Average: "+getAverage());
        System.out.println("Grade: "+getGrade());
        System.out.println("Status: "+(isPassed() ? "Pass" : "Fail"));
    }
}
