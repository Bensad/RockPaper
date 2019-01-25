/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rockpaper;
import java.util.Scanner;
/**
 * 
 *
 * @author besad0473
 */
public class RockPaper {
    
      public static void Start(double choice, double computer, double points, double computerpoints){
          
          System.out.println("1 is rock");
          System.out.println("2 is paper");
          System.out.println("3 is scissors");
          System.out.println("GO");
          Scanner input = new Scanner(System.in);
          choice = input.nextInt();
          if (choice == 1){
                 System.out.println("you are rock");
      }
           if (choice == 2){
                 System.out.println("you are paper");
      }
           if (choice ==3){
               System.out.println("you are scissors");
           }
           Computer( choice,computer );
           
            rockrock(choice, computer, points, computerpoints);
               paperpaper(choice, computer, points, computerpoints);
               scissorsscissors(choice, computer, points, computerpoints);
               scissorspaper(choice, computer, points, computerpoints);
               scissorsrock(choice, computer, points, computerpoints);
               rockpaper(choice, computer, points, computerpoints);
      }
       public static void score(double choice,double computer, double points ,double computerpoints ){
           System.out.println("computers score: " + computerpoints);
           System.out.println("Your score: " + points );
           if (points == 2){
               System.out.println("YOU WIN THE GAME");
               
           }
           else if (computerpoints == 2){
               System.out.println("YOU LOOSE THE GAME");
               
           }
           
            Start( choice, computer, points, computerpoints);  
           
       }

      public static void Computer(double choice,double computer ){
     computer = (int)Math.round(Math.random()*2+1);
     if (computer == 1){
                 System.out.println("computer is rock");
      }
           if (computer == 2){
                 System.out.println("computer is paper");
      }
           if (computer ==3){
               System.out.println("computer is scissors");
           }
}
       public static void rockrock(double choice,double computer, double points ,double computerpoints  ){
            if (computer == 1 && choice == 1){
           
                System.out.println("DRAW");
                score (choice,computer,points,computerpoints);
            }
       }
       public static void paperpaper(double choice,double computer, double points , double computerpoints ){
            if (computer == 2 && choice == 2){
               
                System.out.println("DRAW");
                score (choice,computer,points,computerpoints);
            }
       }
       public static void scissorsscissors(double choice,double computer, double points, double computerpoints  ){
            if (computer == 3 && choice == 3){
                
                System.out.println("DRAW");
                score (choice,computer,points,computerpoints);
            }
            
       }
       public static void scissorspaper(double choice,double computer, double points ,double computerpoints ){
            if (computer == 2 && choice == 1){
               
                System.out.println("YOU LOST");
                computerpoints = computerpoints + 1;
                score (choice,computer,points,computerpoints);
            }
             if (computer == 1 && choice == 2){
               
                System.out.println("YOU WIN");
                points = points + 1;
                score (choice,computer,points,computerpoints);
            }
            
       }
       public static void rockpaper(double choice,double computer, double points ,double computerpoints ){
            if (computer == 3 && choice == 2){
               
                System.out.println("YOU LOST");
                computerpoints = computerpoints + 1;
                score (choice,computer,points,computerpoints);
            }
             if (computer == 2 && choice == 3){
               
                System.out.println("YOU WIN");
                points = points + 1;
              
                score (choice,computer,points,computerpoints);
            }
            
       }
          public static void scissorsrock(double choice,double computer, double points ,double computerpoints ){
            if (computer == 1 && choice == 3){
               
                System.out.println("YOU LOST");
                computerpoints = computerpoints + 1;
                score (choice,computer,points,computerpoints);
            }
             if (computer == 3 && choice == 1){
               
                System.out.println("YOU WIN");
                points = points + 1;
                
                score (choice,computer,points,computerpoints);
            }
            
       }     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double choice;
        double computer;
        double points;
        double computerpoints;
        choice = 0;
        computerpoints = 0;
        computer = 0;
        points = 0;
        
        Start( choice,computer, points, computerpoints); 
    }

   
    
}
