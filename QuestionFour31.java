import java.util.Scanner;

public class QuestionFour31{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter a five digit number: ");
int number = input.nextInt();

int digit = number/10000;
int digit1 = (number/1000)%10;
int digit3 = (number%10)%10;
int digit4 = number%100;

if(digit3 == digit1){
if(digit4 == digit){
System.out.println("it is a palindrom");
}
} 
else{

System.out.println("it is not a palindrom");
}


}

}