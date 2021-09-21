/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv20game;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Sptv20Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Программа загадывает число и просит пользователя отгодать 
        //Если пользователь отгодал, он выйграл 
        //Иначе пользователь проиграл
        int max = 5, min= 0, attempt = 1;
        Scanner scanner = new Scanner (System.in);
        Random random = new Random();
        int gameNum = random.nextInt(max - min +1) + min;
        System.out.println("Программа загадала число от 0 до 5, угадай");
        for(int i=0;1<3; i++){
        int userNum = scanner.nextInt();
        if(gameNum==userNum){
            System.out.println("Ура! Ты выйграл!");
            break;
         }else{
            if(attempt < 3){
                System.out.println("Неправильно, попробуй еще раз: ");
            }
        System.out.println(": (Ты проиграл. Задумано число: " + gameNum);
        
        
       
    }
    }
        attempt++;
}
}
