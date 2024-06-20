import java.util.Scanner;

public class SumDigit2{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter a number between 0 and 1000: ");
int number= input.nextInt();

int digit = number/100;
int digit1 = (number/10)%10;
int digit2 = number%10;

int sum = digit + digit1 + digit2;

System.out.println("The sum of the digit is "+ sum);

}

}