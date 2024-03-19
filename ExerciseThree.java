package HomeWork;

import java.util.Scanner;

public class ExerciseThree {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Calculadora de área y perímetro de un círculo: Pide al usuario el radio de un círculo y calcula tanto el área como el perímetro utilizando las fórmulas:
        // Área = π * radio^2 y Perímetro = 2 * π * radio.

        System.out.println("Enter the area of the circle");
        double radio = scanner.nextDouble();

        double area = Math.PI * Math.pow(radio, 2);

        double perimeter = 2 * Math.PI * radio;

        System.out.println("The area of the circle is: " + area);
        System.out.println("The perimeter of the circle is: " + perimeter);


    }
}
