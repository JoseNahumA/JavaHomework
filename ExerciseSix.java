package HomeWork;

import java.util.Scanner;

public class ExerciseSix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Verificar si un año es un siglo: Pregunta al usuario un año y determina si es un año de un siglo (divisible por 100) y si es un año bisiesto.

        System.out.println("Enter a year");
        int year = scanner.nextInt();

        if (year % 100 == 0) {
            System.out.println(year + " It's a year of a century");
        } else {
            System.out.println(year + " It's not a year of a century");
        }

        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " It's a leap year");
        } else {
            System.out.println(year + " Its not a leap year");
        }

    }
}
