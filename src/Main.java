import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double height, weight, bmi;

        System.out.println("Please enter your height in meters: ");
        height = input.nextDouble();
        System.out.println("Please enter your weight in kilograms: ");
        weight = input.nextDouble();

        bmi = weight / (height * height);
        System.out.println("Your Body Mass Index is: " + bmi);
    }
}