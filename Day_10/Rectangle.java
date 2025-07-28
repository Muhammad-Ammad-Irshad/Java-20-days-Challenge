/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.day_10;

/**
 *
 * @author DELL 5410
 */
public class Rectangle extends Shape implements Drawable {
    private double width;
    private double height;
    
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    
    public double area(){
        return width * height;
    }
    
    public String getName(){
        return "Rectangle";
    }
    public void draw(){
        System.out.println("**************");
        System.out.println("*            *");
        System.out.println("*            *");
        System.out.println("**************");
    }
}
