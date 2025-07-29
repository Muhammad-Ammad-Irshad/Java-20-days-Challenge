/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.day_11;

/**
 *
 * @author DELL 5410
 */
public class Book {
    private String id;
    private String title;
    private String author;
    private boolean isBorrowed;
    
    public Book(String id, String title, String author, boolean isBorrowed){
        this.id = id;
        this.title = title;
        this.author = author;
        this.isBorrowed = isBorrowed;
    }
    
    public String getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public boolean isBorrowed(){
        return isBorrowed;
    }
    public void borrowBook(){
        this.isBorrowed = true;
    }
    public void returnBook(){
        this.isBorrowed = false;
    }
    
    @Override
    public String toString(){
        return id+","+title+","+author+","+isBorrowed;
    }
}
