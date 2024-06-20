import java.util.Scanner;

public class NumberOfYear{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter the number of minutes : ");
int value = input.nextInt();

int year = value/(60 * 24 * 365);
int day = value%(60 * 24 * 365)/(60*24);
System.out.printf("%d minutes is approximately %d years and %d days", value, year, day);
}

}