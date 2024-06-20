import java.util.Scanner;

public class CalculatingEnergy{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter the amount of water in kilogram:");
double water= input.nextDouble();

System.out.println("Enter the initial temperature:");
double initial= input.nextDouble();

System.out.println("Enter the final temperature: ");
double finalTemp = input.nextDouble();

double energy = water * (finalTemp - initial) * 4184;

System.out.println("The energy needed is "+ energy);


}

}