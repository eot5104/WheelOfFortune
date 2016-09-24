/*
* CMPSC 261, Section 1
* Fall 2016
* Instructor: Phil O'Connell
* Student: Elaine Tang
* ID: eot5104
*/
package wheeloffortune;
    

import java.util.List; 
import java.util.Scanner;
import java.util.Random;
public class WheelOfFortune {
    public static void main(String[] args){
       input();
      
      
    }
    
    public static void input(){
        
        String puzzle = "The quick brown fox jumps over the lazy dog";
        String letter;
        String choice;
        int input;
        Scanner keyboard = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n================================\n"+
                "       =WHEEL OF FORTUNE=\n"
                + "================================\n"
                +"1. Spin the wheel\n"
                +"2. Buy a vowel\n"
                +"3. Solve the puzzle\n"
                +"4. Quit the game\n"
                +"5. Test Letter Input\n"
                +"Choice: \n");
        
        choice = scanner.next();
        
         while(true)
      {
      }
          Scanner key = new Scanner(System.in);
          input = keyboard.nextInt();
          letter = key.nextLine();
          while(true)
      {
          input = keyboard.nextInt();
          if (input == 4){
             break;
          }
            
          
            switch(input)
            {
              case 1: System.out.println("You choose to spin the wheel."+letter);
                      break;
              case 2: System.out.println("You choose to buy a vowel."+letter);
                      break;
              case 3: System.out.println(" You choose to solve the puzzle."+letter);
                      break;
              case 4: System.out.println(" You choose to quit the game."+letter);
                      System.exit(0);
                      break;    
              case 5: System.out.println("Test Input;");
                        break;
            }
      }
          
            
            
   

    


 





