/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Grade4 {  
    public static void main( String[] args ) 
     {  
         String names[] = {"Santi", "Novi", "Levira", "Tanti"}; 
       int count = 0; 
       for( int i=0; i<names.length; i++ ){ 
           if( !names[i].equals("Santi") ){ 
               continue; //skip next statement
           }
        count++; 
       }
       System.out.println("5"  + " found!");
            }  
 } 
   