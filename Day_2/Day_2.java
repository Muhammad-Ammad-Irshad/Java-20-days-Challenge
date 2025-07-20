/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.day_2;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author DELL 5410
 */
public class Day_2 {
    private static ArrayList<Contact> contacts = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        do{
            System.out.println("\n---Contact Book---");
            System.out.println("1. Add Contact");
            System.out.println("2. View All Contacts");
            System.out.println("3. Search Contact by Name");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            
            switch(choice){
                case 1 -> addContact();
                case 2 -> viewContact();
                case 3 -> searchContact();
                case 4 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice. Try again.");
            }
        }while(choice != 4);
    }
    public static void addContact(){
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Phone Number: ");
        String phone = scanner.nextLine();
        
        Contact contact = new Contact(name, phone);
        contacts.add(contact);
        System.out.println("Contact added successfully");
    }
    public static void viewContact(){
        if(contacts.isEmpty()){
            System.out.println("No contacts found");
            return;
        }
        System.out.println("---All Contacts---");
        for(Contact contact: contacts){
            contact.displayContact();
        }
    }
    public static void searchContact(){
        System.out.print("Enter name to search: ");
        String searchName = scanner.nextLine().toLowerCase();
        boolean found = false;
        for(Contact contact : contacts){
            if(contact.getName().toLowerCase().contains(searchName)){
                contact.displayContact();
                found = true;
            }
        }
        if(!found){
            System.out.println("No contact found with that name.");
        }
    }
}
