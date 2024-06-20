import java.util.Scanner;

public class SumToTarget{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter the targeted number: ");
int target =  input.nextInt();

int number = 0;
int sum = 0;
while(true){

System.out.println("Enter a number: ");
number =  input.nextInt();
sum += number;
if(target < sum){
System.out.println("The total sum of "+ sum +" is greater than " + target);
break;
}else if (target == sum){
System.out.print("The total sum of numbers is equal to the targetted number "+target);
break;
}

}

}

}