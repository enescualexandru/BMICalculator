import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double height;
        double weight;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Please enter your height, metres: ");
            height = scanner.nextDouble();
            System.out.println("Please enter your weight, in kilograms: ");
            weight = scanner.nextDouble();
            printResult(calculateBMI(height, weight));
        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println("Invalid output !");
        } finally {
            scanner.close();
        }

    }

    private static void printResult(double bmiResult) {
        for (Category cat : Category.values()) {
            if (bmiResult <= cat.getLimit()) {
                String catDesc = cat.toString().replace('_', ' ').toLowerCase();
                System.out.printf("Your BMI value is: %.1f.\nYou are %s", bmiResult, catDesc);
                return;
            }
        }
    }

    private static double calculateBMI(double height, double weight) {
        return weight / (height * height);
    }
}