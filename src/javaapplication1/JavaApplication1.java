/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author kinar
 */

public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        String word = input.next();// input word from user
        char [] name = new char [word.length()];
        System.out.println(name.length);
// store the word in array
for (int i = 0; i< word.length(); i++)
{
    name[i]=word.charAt(i);
}
System.out.print("Kinara Soni");
System.out.print(name[i]);
        //definig array
       // char [] word = new char [5];
        //word[0]='H';
        //word[1]='e';
        //word[2]='l';
        //word[3]='l';
        //word[4]='o';
        //print an array
        //for (int i=0; i<word.length;i++)
        //{
          //  System.out.print(word[i]);
        //}
    }
    
}
