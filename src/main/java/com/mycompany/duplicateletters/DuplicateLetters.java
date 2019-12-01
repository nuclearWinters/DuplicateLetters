/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.duplicateletters;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Armando
 */
 
public class DuplicateLetters 
{
    public static void main(String[] args) 
    {
        System.out.println("Introduce un texto: ");
        Scanner codigo = new Scanner(System.in);
        String string = codigo.nextLine();

        int count;  
          
        //Converts the string into lowercase  
        string = string.toLowerCase();  
          
        //Split the string into words using built-in function  
        String words[] = string.split(" ");  
          
        System.out.println("Palabras duplicadas: ");   
        for(int i = 0; i < words.length; i++) {  
            count = 1;  
            for(int j = i+1; j < words.length; j++) {  
                if(words[i].equals(words[j])) {  
                    count++;  
                    //Set words[j] to 0 to avoid printing visited word  
                    words[j] = "0";  
                }  
            }  
              
            //Displays the duplicate word if count is greater than 1  
            if(count > 1 && words[i] != "0")  
                System.out.println(words[i]);  
        }  
      
    }
}