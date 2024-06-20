import java.util.Scanner;

public class Acceleration2{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter the starting velocity:");
double start= input.nextDouble();

System.out.println("Enter the ending velocity:");
double end= input.nextDouble();

System.out.println("Enter the time: ");
double time = input.nextDouble();

double acceleration = (end - start)/time;

System.out.println("The average acceleration is "+ acceleration);


}

}