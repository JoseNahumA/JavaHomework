package HomeWork;

import java.util.Scanner;

public class ExerciseOne {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        //Calculadora de salario: Pregunta al usuario el número de horas trabajadas en una semana y su salario por hora. Calcula el salario semanal, teniendo en cuenta que las horas extras se pagan al doble del salario normal si exceden las 40 horas.

        System.out.println("How many hours were worked?");
        int hoursWorked = scanner.nextInt();
        System.out.println("What is the hourly wage?");
        double hourlyWage = scanner.nextInt();

        int extraHours = hoursWorked * 7 /40;

        double weeklySalary ;

        if (hoursWorked > 40) {
            double paidOvertime = extraHours * hourlyWage * 2;
            weeklySalary = (40 * hourlyWage) + paidOvertime;
        } else {
            weeklySalary = hoursWorked * hourlyWage;
        }
        System.out.println("The weekly salary is " + weeklySalary);

    }
}
