import java.util.Scanner;

public class CountNumbers{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

int positive = 0;
int negative = 0 ;
int zeros = 0;

while(number != -1){

System.out.print("Enter a number (enter -1 to quit): ");
int number =  input.nextInt();

if (number >0){
positive++;
}else if (number < 0){
negative++;
}else {
zeros++;
}

}

System.out.println("The total number of positive numbers are "+ positive);
System.out.println("The total number of negative numbers are "+ negative);
System.out.println("The total number of zeros numbers are "+ zeros);
}
}