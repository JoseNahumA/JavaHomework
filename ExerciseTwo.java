package HomeWork;

import java.util.Scanner;

public class ExerciseTwo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Determinar el mayor de tres números: Solicita al usuario tres números y determina cuál es el mayor de los tres.

        System.out.println("Enter a number");
        int num1 = scanner.nextInt();
        System.out.println("Enter a second number");
        int num2 = scanner.nextInt();
        System.out.println("Enter a third number");
        int num3 = scanner.nextInt();

        int biggerNumber = num1;
        if (num2 > num1) {
            biggerNumber = num2;
        }
        if (num3 > biggerNumber) {
            biggerNumber = num3;
        }

        System.out.println("The largest number is " + biggerNumber);

    }
}
