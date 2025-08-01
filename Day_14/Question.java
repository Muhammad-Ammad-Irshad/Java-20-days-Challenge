/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.day_14;

/**
 *
 * @author DELL 5410
 */
public class Question {
    String questionText;
    String[] options;
    char correctAnswer;
    
    public Question(String questionText, String[] options, char correctAnswer){
    this.questionText = questionText;
    this.options = options;
    this.correctAnswer = correctAnswer;
    }
    public boolean isCorrect(char userAnswer){
        return Character.toUpperCase(userAnswer) == Character.toUpperCase(correctAnswer);
    }
}
