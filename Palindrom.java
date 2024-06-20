import java.util.Scanner;

public class Palindrom{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter a three digit number: ");
var number = input.nextInt();

var digit = number/100;
var digit1 = (number/10)%10;
var digit2 = number%10;


if (number/100 == digit2 ){
if(number%10 == digit){
if(digit1 == (number/10)%10){
System.out.println("it is a palindrom");
}
}
} 
else{

System.out.println("it is not a palindrom");
}   


//System.out.println("The area of a rectangle when given the width as "
// + width + " and the height as "+ height + " = "+ area  );

//System.out.println("The perimeter of a rectangle when given the width as "
// + width + " and the height as "+ height + " = "+ perimeter );	



}

}