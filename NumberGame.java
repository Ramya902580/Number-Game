import java.util.Scanner;
public class NumberGame
{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        
        int randomNumber=(int)(Math.random()*100)+1;
        
        int chance=10;
        int guess=0;
        boolean play=true;
        System.out.println("Welcome to Random Number Guess Game!");
       
        System.out.println("Enter your guess number between 1 and 100");
         
        while(play){
        while(guess!=randomNumber){
        
        System.out.println("You have only "+chance+" chances to win the Game");
        System.out.println("Enter your guess");
        guess=sc.nextInt();
        chance--;
        
        if(guess<randomNumber){
        System.out.println("Too low try again!");
         
        }
        else if(guess>randomNumber){    
        System.out.println("Too high try again!");
        }
        else{
        System.out.println("Congratulation!");

        System.out.println("Your guess is correct and Your Score is "+chance);
       

        }
        }
    }
        sc.close();  
    }
}