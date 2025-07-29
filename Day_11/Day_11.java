/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.day_11;
import java.util.Scanner;
/**
 *
 * @author DELL 5410
 */
public class Day_11 {

    public static void main(String[] args) {
        Library l = new Library();
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Search Book");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Show All Books");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            
            switch(choice){
                case 1:
                    System.out.print("Enter ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();
                    l.addBook(new Book(id, title, author, false));
                    break;
                case 2:
                    System.out.print("Enter Title to search: ");
                    l.searchBook(sc.nextLine());
                    break;
                case 3:
                    System.out.print("Enter Book ID to Borrow: ");
                    l.borrowBook(sc.nextLine());
                    break;
                case 4:
                    System.out.print("Enter Book ID to Return: ");
                    l.returnBook(sc.nextLine());
                    break;
                case 5:
                    l.showAllBooks();
                    break;
                case 6:
                    System.out.println("Exiting..");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }while(choice != 6);
        sc.close();
    }
}
