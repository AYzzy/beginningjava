import java.util.Scanner;

public class FootIntoMeter{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

int footMeter = 0.305;

System.out.print("Enter the value for foot: ");
int value= input.nextInt();

int total = footMeter*value;

System.out.println(value +"feet is "+total +"meters");
}

}