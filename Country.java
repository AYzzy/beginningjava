import java.util.Scanner;

public class Country{
public static void main(String [] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter the first country: ");
String one = input.nextLine();
System.out.print("Enter the second country: ");
String two = input.nextLine();
System.out.print("Enter the third country: ");
String three = input.nextLine();

char first = one.charAt(0);
char second = two.charAt(0);
char third = three.charAt(0);

if (first > second && first > third){
System.out.println(" The three country in descending order are "
+ one + two +three);
}else if (first > third && first > second){
System.out.println(" The three country in descending order are "
+ one + three + two);
}else if (second > first && second > third){
System.out.println(" The three country in descending order are "
+ two + first + three);
}else if (second > third && second > first){
System.out.println(" The three country in descending order are "
+one+ three+two);
}else if ( third > first && third > second){
System.out.println(" The three country in descending order are "
+ three + one + two);
}else if ( third > second && third > first){
System.out.println("The three country in descending order are "
+three + two + one);
}

}

}	