/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.day_9;

/**
 *
 * @author DELL 5410
 */
class User {
    private String userName;
    private String password;
    
    public User(String userName, String password){
        this.userName = userName;
        this.password = password;
    }
    public String getUserName(){
        return userName;
    }
    public String getPassword(){
        return password;
    }
}
