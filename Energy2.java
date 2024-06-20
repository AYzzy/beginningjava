import java.util.Scanner;

public class Energy2{
public static void main(String[] args){

Scanner input = new Scanner(System.in);


System.out.println("Enter the amount of water :");
double value = input.nextDouble();

System.out.println("Enter the initial temperature :");
double initial = input.nextDouble();

System.out.println("Enter the final temperature :");
double finalTemp= input.nextDouble();

double energy = value * (finalTemp - initial )* 4184;

System.out.println("The energy needed is "+ energy);

}

}