/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.day_1;

/**
 *
 * @author DELL 5410
 */
public class Calculator {
    public double add(double a, double b){
        return a + b;
    }
    public double subtract(double a, double b){
        return a - b;
    }
    public double divide(double a, double b){
        if(b == 0){
            System.out.println("Error: Division by zero is not allowed");
            return Double.NaN;
        }
        return a/b;
    }
    public double multiply(double a, double b){
        return a * b;
    }
}
