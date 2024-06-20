
import java.util.Scanner;

public class Question33 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter your weight in pounds:");
        int weightInPounds = scanner.nextInt();

        System.out.println("Enter your height in inches:");
        int heightInInches = scanner.nextInt();

        double bmi = (weightInPounds * 703.0) / (heightInInches * heightInInches);

        System.out.println("Your BMI is: " + bmi);

    }
}
