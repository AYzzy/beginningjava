import java.util.Scanner;

public class FootIntoMeter{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
int sum=0;

System.out.print("Enter a number between 0 and 1000 : ");
int value= input.nextInt();

int digit = value%10;
int digit1 = (value/10)%10 ;
int digit2 = value/100;

sum= digit+digit1+digit2;


System.out.printf("The sum of the digit is %d", sum);
}

}