import java.util.Scanner;

public class TripCost{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter the distance: ");
double distance = input.nextDouble();

System.out.print("Enter the mile per gallon: ");
double mile= input.nextDouble();

System.out.print("Enter the price per gallon: ");
double price= input.nextDouble();

double gallonPerTrip =(distance / mile);

double total=gallonPerTrip * price;

System.out.printf("The cost of trip is : %.2f", total);

}

}