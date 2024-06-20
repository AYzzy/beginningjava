import java.util.Scanner;

public class SumDigit{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter a number between 0 and 1000: ");
int value= input.nextInt();

int digit = value %10;
int digit1 = (value/10)%10;
int digit2 = value/100;

int sum = digit + digit1 + digit2;


System.out.printf("The sum of the digit %d", sum);
}

}