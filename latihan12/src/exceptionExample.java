/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class exceptionExample {
     public static void main( String[] args ){ 
 
        try{ 
 
            System.out.println( args[1] ); 
 
        }catch( ArrayIndexOutOfBoundsException exp ){ 
 
            System.out.println("Exception caught!"); 
        }
    
}}
