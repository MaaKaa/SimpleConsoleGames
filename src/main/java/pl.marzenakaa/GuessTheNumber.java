package pl.marzenakaa;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(101)-1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the number:");


        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.print("This is not a number. Try again:");
        }

        while(scanner.hasNextInt()){
            int userGuess = scanner.nextInt();
            if(userGuess < number){
                System.out.println("The number is bigger! Try again:");
            }else if(userGuess > number){
                System.out.println("The number is smaller! Try again:");
            }else if(userGuess == number){
                System.out.println("You're right! Congrats!");
            }
        }

        scanner.close();
    }

}
