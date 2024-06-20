import java.util.Scanner;

public class RunawayLenght{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter speed:");
double speed = input.nextDouble();
System.out.println("Enter acceleration: ");
double acc = input.nextDouble();

double lenght = (speed*speed)/ (2*acc);


System.out.printf("The minimum runway lenght is %.2f" ,lenght);

}

}