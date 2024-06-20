import java.util.Scanner;

public class PassOrFail{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

int score = 0;

while(score != -1){
	System.out.println("Enter your score (Enter -1 to end program): ");
	score = input.nextInt();
	if (score >= 60){
	System.out.println("You pass the score");
	}
	else{
	System.out.println("You fail the score");
	}
	
	}

}

}