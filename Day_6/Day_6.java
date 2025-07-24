/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.day_6;

/**
 *
 * @author DELL 5410
 */
public class Day_6 {

    public static void main(String[] args) {
        System.out.println("Method Overloading example:");
        Calculator calc = new Calculator();
        System.out.println("\nAdd two integers: "+calc.add(2, 7));
        System.out.println("Add three integers: "+calc.add(10, 50, 5));
        System.out.println("Add two doubles: "+calc.add(2.5, 2.5));
        
        System.out.println("\nMethod Overriding exapmle:");
        Animal A;
        A = new Dog();
        A.sound();
        A = new Cat();
        A.sound();
    }
}
