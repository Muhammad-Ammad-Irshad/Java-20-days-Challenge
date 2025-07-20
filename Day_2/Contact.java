/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.day_2;

/**
 *
 * @author DELL 5410
 */
public class Contact {
    private String name;
    private String phoneNumber;
    
    public Contact(String name, String phoneNumber){
    this.name = name;
    this.phoneNumber = phoneNumber;
    }
    public String getName(){
        return name;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void displayContact(){
        System.out.println("Name: "+name+", Phone: "+phoneNumber);
    }
}
