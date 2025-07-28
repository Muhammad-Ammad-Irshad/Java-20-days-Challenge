/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.day_10;
import java.io.*;
import java.util.*;
import java.util.Scanner;
/**
 *
 * @author DELL 5410
 */
public class Day_10 {

    private static final String FILE = "shape.txt";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("\n1. Add new shape\n2. View saved shapes\n3. Exit");
            int choice = sc.nextInt();
            if(choice == 1){
                System.out.println("Choose shape: 1. Circle  2. Rectangle");
                int type = sc.nextInt();
                Shape shape = null;
                
                if(type == 1){
                    System.out.print("Enter radius: ");
                    double r = sc.nextDouble();
                    shape = new Circle(r);
                }
                else if(type == 2){
                    System.out.print("Enter width: ");
                    double w = sc.nextDouble();
                    System.out.print("Enter height: ");
                    double h = sc.nextDouble();
                    shape = new Rectangle(w, h);
                }
                
                if(shape != null){
                    double area = shape.area();
                    System.out.println("Shape: "+ shape.getName());
                    System.out.println("Area: "+area);
                    ((Drawable) shape).draw();
                    Day_10.saveShape(shape.getName(), area);
                    System.out.println("Saved successfully");
                }
            }else if(choice == 2){
                System.out.println("Loading saved shapes...");
                Day_10.loadShapes();
            }else{
                break;
            }
        }
        sc.close();
    }
    public static void saveShape(String name, double area){
        try(FileWriter fw = new FileWriter(FILE, true);
                BufferedWriter bw = new BufferedWriter(fw)){
                    bw.write(name+","+area);
                    bw.newLine();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void loadShapes(){
        try(BufferedReader br = new BufferedReader(new FileReader(FILE))){
            String line;
            int count = 1;
            while ((line = br.readLine()) != null){
                String[] parts = line.split(",");
                System.out.println(count++ +". "+parts[0] +"| Area: "+parts[1]);
            }
        }catch(IOException e){
            System.out.println("No saved shapes found.");
        }
    }
}
