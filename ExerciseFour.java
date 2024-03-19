package HomeWork;

import java.util.Scanner;

public class ExerciseFour {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        //Conversor de moneda: Pregunta al usuario una cantidad en una divisa y el tipo de cambio actual a otra divisa. Convierte la cantidad a la otra divisa.

        System.out.println("Enter the amount to convert");
        double amount = scanner.nextDouble();
        System.out.println("Enter the exchange rate");
        double exchangeRate = scanner.nextDouble();

        double amountConverted = amount * exchangeRate;

        System.out.println("The converted amount is: " + amountConverted);

    }
}
