/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.day_5;

/**
 *
 * @author DELL 5410
 */
class Doctor extends Person{
    private String specialization;
    
    public Doctor(String name, int age, String specialization){
        super(name, age);
        this.specialization = specialization;
    }
    
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Specialization: "+specialization);
    }
}
