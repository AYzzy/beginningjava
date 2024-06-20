import java.util.Scanner;

public class Energy{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter the amount of water in kilogram : ");
double value = input.nextDouble();

System.out.print("Enter the inital temperature: ");
double initial = input.nextDouble();

System.out.print("Enter the final temperature: ");
double finalTemp = input.nextDouble();

double energy = value * (finalTemp - initial) * 4184 ;


System.out.printf("The energy neeed is %.2f", energy);
}

}