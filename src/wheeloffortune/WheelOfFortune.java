/*
* CMPSC 261, Section 1
* Fall 2016
* Instructor: Phil O'Connell
* Student: Elaine Tang
* ID: eot5104
*/
package wheeloffortune;
    


import java.util.Scanner;
import java.util.Random;

public class WheelOfFortune {
    

    public static void main(String[] args){
        String puzzle = "The quick brown fox jumps over the lazy dog"; 
        String letter;            
        Scanner guess; 
        
        guess =  new Scanner(System.in);
        
        
        Scanner scanner = new Scanner(System.in); //getting input from the same keyboard
        System.out.println("\n================================\n"+//Title
                "       =WHEEL OF FORTUNE=\n"
                + "================================\n"
                +"1. Spin the wheel\n"//Spin the wheel
                +"2. Buy a vowel\n"//buy a vowel
                +"3. Solve the puzzle\n"//solve the puzzle
                +"4. Quit the game\n"//quit the game
                +"5. Toggle\n" //
                +"9. Test Letter Input\n");
        
         boolean done = false; //quitting the game
         while(!done){
         String input = guess.nextLine();
         letter = scanner.next();
         if (letter.matches("[A-z]")){
                 System.out.println("You choose the letter:"+ letter);
                }
                else{
                 System.out.println("This is not a letter");
                   
                    }
         int choice = Integer.parseInt(input);//return integer of the string choice

            
          
        switch(choice)
          {
             case 1:System.out.println("You choose to spin the wheel."+letter);//user chose to spin the wheel
                     SpinWheel();
                     Puzzle();
                  
                     System.out.println("You chose:");//prints out what the user chose
              
                      break;//stops the loop and moves on to the next statement
              case 2:System.out.println("You choose to buy a vowel."+letter);//user chose to buy a vowel
                     break;//stops the loop and moves on to the next statement
              case 3:System.out.println(" You choose to solve the puzzle."+letter);//user chose to solve the puzzle
                     break;//stops the loop and moves on to the next statement
              case 4:System.out.println(" You choose to quit the game."+letter);//user chose to quit game
                     System.exit(0);
                     break;   //stops the loop and moves on to the next statement 
              case 5:System.out.println(puzzle);
                     int number;
                     Scanner scan = new Scanner(System.in);
                     System.out.println("Press 5 to untoggle the puzzle");
                     number = scan.nextInt();
              
              break;//stops the loop and moves on to the next statement
              case 9:System.out.println("Test Input;");
                     break;//stops the loop and moves on to the next statement
            }
         }
    }
    
    public static void SpinWheel(){
     
        String[] WheelVal = {"$300","$300","$300","$300","$300","$350","$400",
          "$400","$450","$500","$500","$500","$550","$600","$600","$600","$700","$800"//Random values of the wheel
              , "$800","$900","$900","$5000","BANKRUPT", "LOSE A TURN"};
        
        Random random = new Random();//allow users to land on a random value
        int index = random.nextInt(WheelVal.length); //pick random number from array
        System.out.println("You landed on: "+WheelVal[index]);//shows what the user landed on
    }
    public static void Puzzle(){
      String puzzle = "The quick brown fox jumps over the lazy dog"; //the answer to the puzzle
      String input = " "; //string input blank
      Scanner guess = new Scanner(System.in);
      boolean puzzleNotSolved = true; 
      while (puzzleNotSolved){ //convert string to character arrays
          for (char unvieldLetter: puzzle.toCharArray()) {

              if (input.indexOf(unvieldLetter) == -1) {
                  System.out.print("_ "); //doesn't show the answers, covered with blanks
                  puzzleNotSolved = true;
                  
              }
              else{
                  System.out.print(unvieldLetter);//print out blanks if the letter entered isn't true
              }
          }
          if (! puzzleNotSolved ) {
              break;
              
      }
           System.out.println("\nEnter a Letter: ");
           String character = guess.next();
           input += character;
      }
           
           System.exit(0);//quits the game
      }
    }
    
        
         
      
          
            
            
   

    


 





