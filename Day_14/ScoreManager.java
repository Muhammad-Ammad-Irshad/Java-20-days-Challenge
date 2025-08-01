/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.day_14;
import java.io.*;
/**
 *
 * @author DELL 5410
 */
public class ScoreManager {
    private static final String FILE_NAME = "highscore.txt";
    
    public static int getHighScore(){
        try(BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))){
            String line = reader.readLine();
            return (line != null) ? Integer.parseInt(line) : 0;
        }catch(IOException | NumberFormatException e){
            return 0;
        }
    }
    
    public static void saveScore(int score){
        int highScore = getHighScore();
        if(score > highScore){
            try(BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))){
                writer.write(String.valueOf(score));
            }catch(IOException e){
                System.out.println("Error saving high score: "+e.getMessage());
            }
        }
    }
}
