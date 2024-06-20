import java.util.Scanner;

public class Investment{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter investment amount: ");
double amount= input.nextDouble();

System.out.print("Enter annual interest rate in percentage: ");
double rate= input.nextDouble();

System.out.print("Enter number of years: ");
int year = input.nextInt();
 
int yearTotal = year * 12;
double totalRate = 1 + (rate/100);
double invest = Math.pow(totalRate,yearTotal);

double total = amount * invest;


System.out.printf("Accumulated value is $%.2f", total);

}

}