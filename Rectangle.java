import java.util.Scanner;

public class Rectangle{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter the width:");
double value1 = input.nextDouble();

System.out.print("Enter the height:");
double value2 = input.nextDouble();

double areaTotal =value1 * value2 ;
double perimeterTotal = 2 * (value1 + value2);

System.out.printf( "The total area of a rectangle is %.2f%n" ,areaTotal);

System.out.printf("The total perimeter of the rectangle is %.2f",perimeterTotal);
}

}