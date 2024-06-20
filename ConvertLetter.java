import java.util.Scanner;

public class ConvertLetter{
public static void main(String [] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter a letter grade: ");
char letter = input.nextLine().charAt(0);

if(letter == 'A'){
System.out.print("The numeric value for  grade A is 4");
}else if(letter == 'B'){
System.out.print("The numeric value for  grade B is 3");
}else if(letter == 'C'){
System.out.print("The numeric value for  grade C is 2");
}else if(letter == 'D'){
System.out.print("The numeric value for  grade D is 1");
}else if(letter == 'F'){
System.out.print("The numeric value for  grade F is 3");
}else{
System.out.println(letter+" is an invalid grade");
}


}


}