
import java.util.Scanner;

public class Question35 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

	int day= 365;
	int hour = 24;
	int minutes = 60;

        System.out.println("Enter The Estimated number of stone used:");
        int number = scanner.nextInt();

        System.out.println("Enter The Average weight of each stone:");
        double weight = scanner.nextDouble();

	System.out.println("Enter The number of years taken to build the pyramide:");
        int years = scanner.nextInt();
		
	int days = years * day;
	double weightTotal = number * weight;
	double builtEachYear = weightTotal / days;
	double builtEveryHour = weightTotal /days /hour;
	double builtEveryMinute = builtEveryHour /  minutes;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
        System.out.println("The total weight of the pyramid : " + weightTotal);
	System.out.println("The total weight built every year : " + builtEachYear);
	System.out.println("The total weight built every hour  : " + builtEveryHour);
	System.out.println("The total weight built every minutes: " + builtEveryMinute);
	     

	}
}
