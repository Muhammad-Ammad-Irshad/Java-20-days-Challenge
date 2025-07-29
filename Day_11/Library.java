/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.day_11;
import java.io.*;
import java.util.*;
/**
 *
 * @author DELL 5410
 */
public class Library {
    private List<Book> books;
    private final String FILE_NAME = "books.txt";
    
    public Library(){
        books = new ArrayList<>();
        loadBooksFromFile();
    }
    
    private void loadBooksFromFile(){
        try(BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))){
            String line;
            while((line = reader.readLine()) != null){
                String[] parts = line.split(",");
                books.add(new Book(parts[0], parts[1], parts[2], Boolean.parseBoolean(parts[3])));
            }
        }catch(IOException e){
            System.out.println("Error loading books.");
        }
    }
    public void saveBooksToFile(){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))){
            for(Book book : books){
                writer.write(book.toString());
                writer.newLine();
            }
        }catch(IOException e){
            System.out.println("Error saving books");
        }
    }
    public void addBook(Book book){
        books.add(book);
        saveBooksToFile();
        System.out.println("Book added.");
    }
    public void searchBook(String title){
        boolean found = false;
        for(Book book : books){
            if(book.getTitle().equalsIgnoreCase(title)){
                System.out.println(book.getId()+" - "+book.getTitle()+" by "+book.getAuthor()+" | Borrowed: "+book.isBorrowed());
                found = true;
            }
        }
        if(!found){
            System.out.println("Book not found.");
        }
    }
    public void borrowBook(String id){
        for (Book book : books){
            if(book.getId().equals(id) && !book.isBorrowed()){
                book.borrowBook();
                saveBooksToFile();
                System.out.println("Book Borrowed");
                return;
            }
        }
        System.out.println("Book not available or already borrowed");
    }
    public void returnBook(String id){
        for(Book book : books){
            if(book.getId().equals(id) && book.isBorrowed()){
                book.returnBook();
                saveBooksToFile();
                System.out.println("Book returned");
                return;
            }
        }
        System.out.println("Book not found or not borrowed");
    }
    public void showAllBooks(){
        for(Book book : books){
            System.out.println(book.getId()+" | "+book.getTitle()+" | "+book.getAuthor()+" | Borrowed: "+book.isBorrowed());
        }
    }
}
