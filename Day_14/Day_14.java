/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.day_14;
import java.io.*;
import java.util.*;
/**
 *
 * @author DELL 5410
 */
public class Day_14 {

    public static void main(String[] args) {
        List<Question> questions = loadQuestionsFromFile("questions.txt");
        if(questions.isEmpty()){
            System.out.println("No questions found. Exiting");
            return;
        }
        
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        
        for(int i = 0; i < questions.size(); i++){
            Question q = questions.get(i);
            System.out.println("Q"+ (i+1)+": "+q.questionText);
            char[] optionsLabels = {'a', 'b', 'c', 'd'};
            
            for(int j = 0; j < 4; j++){
                System.out.println(optionsLabels[j]+") "+q.options[j]);
            }
            
            String input = "";
            do {
                System.out.print("Your answer: ");
                input = scanner.nextLine().trim();
            } while (input.isEmpty());

            char userAnswer = input.charAt(0);
            
            if(q.isCorrect(userAnswer)){
                System.out.println("Correct!\n");
                score++;
            }else{
                System.out.println("Wrong! Correct answer: "+q.correctAnswer);
            }
        }
        System.out.println("Quiz Over! Your score: "+score+"/"+questions.size());
        ScoreManager.saveScore(score);
        int highScore = ScoreManager.getHighScore();
        System.out.println("Your Score: "+score);
        System.out.println("Highest Score Ever: "+highScore);
    }
    
    public static List<Question> loadQuestionsFromFile(String filename){
        List<Question> questions = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(filename))){
            String line;
            while((line = reader.readLine()) != null){
                String questionText = line;
                String[] options = new String[4];
                for(int i = 0; i < 4; i++){
                    options[i] = reader.readLine();
                }
                char correct = reader.readLine().charAt(0);
                questions.add(new Question(questionText, options, correct));
            }
        }catch(IOException e){
            System.out.println("Error reading file: "+e.getMessage());
        }
        return questions;
    }
}
