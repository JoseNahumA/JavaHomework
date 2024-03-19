package HomeWork;

import java.util.Random;
import java.util.Scanner;

public class ExerciseSeven {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        //Juego de adivinar un número: Genera aleatoriamente un número entre 1 y 100 y pide al usuario que adivine el número. Proporciona pistas indicando si el número ingresado es mayor o menor que el número generado. (este no lo hagas aun, lo haras despues de la siguiente clase)

        System.out.println("Welcome to the number guessing game!");
        System.out.println("A number between 1 and 100 has been generated. Try to guess it!");

        int numberToGuess = random.nextInt(100) + 1;
        int attempts = 0;
        System.out.println("Enter a number");
        int userGuess = scanner.nextInt();
        boolean guessed = false;


            if (userGuess == numberToGuess) {
                guessed = true;
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts!");
            } else if (userGuess < numberToGuess) {
                System.out.println("The number I'm thinking of is greater than " + userGuess + ".");
            } else {
                System.out.println("The number I'm thinking of is less than " + userGuess + ".");
            }
        }



    }
