/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaperscissors;

/**
 *
 * @author 196033BoldenA
 */
 import java.util.Scanner;
 import java.util.Random;
public class RockPaperScissors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner user_input= new Scanner(System.in);
        System.out.println("Enter your first name");
        
        String name= user_input.next();
        int Game_choice;
     
        Random rand= new Random();
        int Computer_Int =rand.nextInt(3);
      
           do {
            System.out.println(name+",enter the 1 for Rock, 2 for Paper or 3 for Scissors:");
             Game_choice = user_input.nextInt();
            if (Game_choice> 3 || Game_choice < 1){
             System.err.println("Why did you type the wrong number I said 1,2 or 3.");
            }             
        } while (Game_choice> 3 || Game_choice < 1); {
            
            }
            
            ///Scanner keyboard = new Scanner(System.in);
            int Scissors, Rock, Paper;
            Rock = 1;
            Paper = 2;
            Scissors= 3;
        
            
  if( Game_choice == Computer_Int){
       System.out.println("Tied");
       
    }else if ("1".equals(Game_choice)){
      if(Computer_Int == 2){
       System.out.println("You lose!, Rock beats paper");
    }else{
       System.out.println("You win! Rock beats paper");
   }
      
    }else if ("2".equals(Game_choice)){
      if(Computer_Int == 1){
        System.out.println("You lose! Paper beats Rock");
      }else{
         System.out.println("You win! Rock beats paper");
      }
      
    }else if ("3".equals(Game_choice)){
    if (Computer_Int == 1){
          System.out.println("You lose! Rock beats Scissors");
    }else{
            System.out.println("You win! Rock beats Scissors");
    }
    }else{
   
    }
  
    }
}
