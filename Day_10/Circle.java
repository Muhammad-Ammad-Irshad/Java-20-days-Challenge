/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.day_10;

/**
 *
 * @author DELL 5410
 */
public class Circle extends Shape implements Drawable{
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public double area(){
        return Math.PI*radius*radius;
    }
    public String getName(){
        return "Circle";
    }
    public void draw(){
        System.out.println("    ***   ");
        System.out.println("   *   *  ");
        System.out.println("    ***   ");
    }
}
