/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.day_4;

/**
 *
 * @author DELL 5410
 */
public class Day_4 {

    public static void main(String[] args) {
        Book myBook = new Book("Bastards of Istanbul", "Elif Shfak", 2006);
        myBook.displayInfo();
        myBook.setTitle("Forty Rules of Love");
        System.out.println("Updated Title: "+myBook.getTitle());
        myBook.displayInfo();
    }
}
