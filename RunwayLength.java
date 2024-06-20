import java.util.Scanner;

public class RunwayLength{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter speed: ");
double speed = input.nextDouble();

System.out.print("Enter acceleration: ");
double acceleration = input.nextDouble();


double runwayLength = (speed * speed)/ (2 * acceleration)  ;


System.out.printf("The minimum runway lenght for this airplane %.3f", runwayLength);
}

}