import java.util.Scanner;

public class Radius{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter the radius:");
double radius = input.nextDouble();



double areaTotal =2 * radius * 3.14159;
double perimeterTotal = radius * radius * 3.14159;

System.out.printf( "The total area radius of a circle is %.2f%n" ,areaTotal);

System.out.printf("The total perimeter radius of a circle is %.2f",perimeterTotal);
}

}