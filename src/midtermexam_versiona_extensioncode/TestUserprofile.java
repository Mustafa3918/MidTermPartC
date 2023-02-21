/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author theca
 */
public class TestUserprofile{
    public static void main(String[] args){
        
        String userID;
        String genre;
        
          Scanner keyboard = new Scanner(System.in);
          System.out.println("Enter your name" +keyboard);
         
          userID=keyboard.nextLine(); 
          
          Scanner scanner = new Scanner(System.in);
          System.out.println("Enter your favourite genre: Comedy Drama Action Mystery");
          genre=scanner.nextLine();
        
        System.out.println("Your user profile has been created!");
    }
}
