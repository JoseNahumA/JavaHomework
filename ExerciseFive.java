package HomeWork;

import java.util.Scanner;

public class ExerciseFive {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Ordenar tres números: Solicita al usuario tres números y muéstralos ordenados de menor a mayor.

        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();

        System.out.println("Enter the third number:");
        double num3 = scanner.nextDouble();


        double valueOne;
        if (num1 > num2) {
            valueOne = num1;
            num1 = num2;
            num2 = valueOne;
        }
        if (num2 > num3) {
            valueOne = num2;
            num2 = num3;
            num3 = valueOne;
        }
        if (num1 > num2) {
            valueOne = num1;
            num1 = num2;
            num2 = valueOne;
        }

        System.out.println("The numbers ordered from smallest to largest are: ");
        System.out.println(num1 + ", " + num2 + ", " + num3);



    }
}
