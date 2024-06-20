import java.util.Scanner;
import java.util.Random;
public class Game{
public static void main(String [] args){
Random rand = new Random();
Scanner input = new Scanner(System.in);

int Scissors = 0;
int Rock = 1;
int Paper = 2;

System.out.print("Scissors (0), rock(1), paper(2): ");
int number= input.nextInt();

int compInput = rand.nextInt(3);
System.out.println("The computer is " + compInput);
if(compInput == number){
System.out.println("ITS A DRAW");
}else if (compInput == Scissors && number == Paper || compInput == Paper && number ==Rock 
|| compInput == Rock && number == Scissors ){
System.out.println("You Loss");
}else if (compInput == Paper && number == Scissors || compInput == Rock && number == Paper 
|| compInput ==Scissors && number == Rock){
System.out.println("You Win");

}

}

}