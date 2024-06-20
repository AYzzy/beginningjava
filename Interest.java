import java.util.Scanner;

public class CalculateBMI{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter weight in pound : ");
double pound = input.nextDouble();

System.out.print("Enter height in inches: ");
double height = input.nextDouble();

double totalPound = pound * 0.45359237;
double totalHeight = height * 0.0254;
double bmi = totalPound/(totalHeight * totalHeight)

System.out.printf("BMI is %.4f", bmi);

}

}