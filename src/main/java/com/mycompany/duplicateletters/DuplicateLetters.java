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
        String blogName = codigo.nextLine();
        blogName = blogName.toLowerCase();
        char[] chars = blogName.toCharArray();
         
        Map<Character, Integer> map = new HashMap<>();
        for(char c : chars) 
        {
            if(map.containsKey(c)) {
                int counter = map.get(c);
                map.put(c, ++counter);
            } else {
                map.put(c, 1);
            }
        }
         
        System.out.println("Letras suplicadas excepto signos de puntiuación: ");
         
        //Print duplicate characters excluding white space
        for(char c : map.keySet()) {
            if(map.get(c) > 1 && Character.isLetter(c)) {
                System.out.println(c);
            }
        }
    }
}