import java.util.Scanner;

public class Kilogram{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter a number in pound: ");
double value = input.nextDouble();



double total = value * 0.454;

System.out.printf("%.2f pound is %.3f", value, total);

}

}