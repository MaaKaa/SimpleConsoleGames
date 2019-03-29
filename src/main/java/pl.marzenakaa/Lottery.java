package pl.marzenakaa;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lottery {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 6 numbers:");

        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.print("This is not a number. Try again:");
        }

        int[] userNumbers = new int[6];
        int counter = 0;

        /*do {
            for (int i=0; i<userNumbers.length; i++){
                while(scanner.hasNextInt()){
                    int number = scanner.nextInt();
                    userNumbers[i] = number;
                    counter++;
                }
            }
        } while (counter == 6); */

        scanner.close();

        System.out.println("Your numbers: " + Arrays.toString(userNumbers));

        int[] winningNumbers = new int[6];
        drawNumbers(winningNumbers);
        System.out.println("Winning numbers: " + Arrays.toString(winningNumbers));
    }

    public static int[] drawNumbers(int[] array){
        Random random = new Random();
        for (int i=0; i<array.length; i++){
            array[i] = random.nextInt(50)-1;
        }
        Arrays.sort(array);
        return array;
    }
}
