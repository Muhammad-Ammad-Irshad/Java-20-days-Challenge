/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.day_5;

/**
 *
 * @author DELL 5410
 */
class Patient extends Person{
    private String illness;
    
    public Patient(String name, int age, String illness){
        super(name, age);
        this.illness = illness;
    }
    
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Illness: "+illness);
    }
}
