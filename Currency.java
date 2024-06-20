import java.util.Scanner;

public class Currency{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter 0 to covert dollar to RMB and 1 vice verse: ");
int currency= input.nextInt();

if(currency == 0){

System.out.println("Enter the exchange rate from dollar to RMB: ");
double rate= input.nextDouble();

System.out.println("Enter the dollar amount: ");
double amount = input.nextDouble();

double totalAmount = rate * amount;

System.out.println("$" + amount + " is " +totalAmount +"Yuan");

}
else{

System.out.println("Enter the exchange rate from RMB to dollar: ");
double rate= input.nextDouble();

System.out.println("Enter the RMB amount: ");
double amount = input.nextDouble();

double totalAmount = rate * amount/46.36;

System.out.println( amount + " yuan is $" +totalAmount );
}


}

}