/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.day_1;

import java.util.Scanner;
/**
 *
 * @author DELL 5410
 */
public class Day_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        System.out.println("---Basic Calculator---");
        while(true){
            System.out.println("\nChoose operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            if(choice == 5){
                System.out.println("Exiting..");
                break;
            }
            
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();
            
            double result = 0;
            switch (choice) {
                case 1:
                    result = calc.add(num1, num2);
                    break;
                case 2:
                    result = calc.subtract(num1, num2);
                    break;
                case 3:
                    result = calc.multiply(num1, num2);
                    break;
                case 4:
                    result = calc.divide(num1, num2);
                    break;
                default:
                    System.out.println("Invalid choice.");
                    continue;
            }
            System.out.println("Result: "+result);
        }
        scanner.close();
    }
}
