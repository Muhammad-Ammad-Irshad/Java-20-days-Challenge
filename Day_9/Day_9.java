/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.day_9;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author DELL 5410
 */
public class Day_9 {
    private final String filePath = "users.txt";

    public void register(User user){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))){
            writer.write(user.getUserName() + "," + user.getPassword());
            writer.newLine();
            System.out.println("Registration successfully");
        }catch(IOException e){
            System.out.println("Error while registering user: "+e.getMessage());
        }
    }
    public boolean login(String userName, String password){
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = reader.readLine()) != null){
                String[] parts = line.split(",");
                if(parts.length == 2){
                    String storedUser = parts[0];
                    String storedPass = parts[1];
                    
                    if(storedUser.equals(userName) && storedPass.equals(password)){
                        return true;
                    }
                }
            }
        }catch(IOException e){
            System.out.println("Error while logging in: "+e.getMessage());
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Day_9 auth = new Day_9();
        while(true){
            System.out.println("\n---Menu---");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();
            
            if(choice == 1){
                System.out.print("Enter Username: ");
                String user = sc.nextLine();
                System.out.print("Enter Password: ");
                String pass = sc.nextLine();
                
                User newUser = new User(user, pass);
                auth.register(newUser);
            }
            else if(choice == 2){
                System.out.println("Enter Username: ");
                String user = sc.nextLine();
                System.out.println("Enter Password: ");
                String pass = sc.nextLine();
                
                if(auth.login(user, pass)){
                    System.out.println("Login successfully");
                }else{
                    System.out.println("Invalid credentials");
                }
            }
            else if(choice == 3){
                System.out.println("Exiting..");
                break;
            }else{
                System.out.println("Invalid option");
            }
        }
        sc.close();
    }
}
