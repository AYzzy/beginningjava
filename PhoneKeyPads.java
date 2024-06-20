import java.util.Scanner;

public class PhoneKeyPads{
public static void main(String [] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter a letter: ");
char letter = input.nextLine().charAt(0);

if(letter == 'A'|| letter == 'B'||letter == 'C'){
System.out.print("The corresponding number is 2");
}else if(letter == 'D'|| letter == 'E'||letter == 'F'){
System.out.print("The corresponding number is 3");
}else if(letter == 'G'|| letter == 'H'||letter == 'I'){
System.out.print("The corresponding number is 4");
}else if(letter == 'J'|| letter == 'K'||letter == 'L'){
System.out.print("The corresponding number is 5");
}else if(letter == 'M'|| letter == 'N'||letter == 'O'){
System.out.print("The corresponding number is 6");
}else if(letter == 'P'|| letter == 'Q'||letter == 'R'|| letter == 'S'){
System.out.print("The corresponding number is 7");
}else if(letter == 'T'|| letter == 'U'||letter == 'V'){
System.out.print("The corresponding number is 8");
}else if(letter == 'W'|| letter == 'X'||letter == 'Y'||letter == 'Z'){
System.out.print("The corresponding number is 9");
}
else if(letter == 'a'|| letter == 'b'||letter == 'c'){
System.out.print("The corresponding number is 2");
}else if(letter == 'd'|| letter == 'e'||letter == 'f'){
System.out.print("The corresponding number is 3");
}else if(letter == 'g'|| letter == 'h'||letter == 'i'){
System.out.print("The corresponding number is 4");
}else if(letter == 'j'|| letter == 'k'||letter == 'l'){
System.out.print("The corresponding number is 5");
}else if(letter == 'm'|| letter == 'n'||letter == 'o'){
System.out.print("The corresponding number is 6");
}else if(letter == 'p'|| letter == 'q'||letter == 'r'|| letter == 's'){
System.out.print("The corresponding number is 7");
}else if(letter == 't'|| letter == 'u'||letter == 'v'){
System.out.print("The corresponding number is 8");
}else if(letter == 'w'|| letter == 'x'||letter == 'y'||letter == 'z'){
System.out.print("The corresponding number is 9");
}else{
System.out.println(letter+" is as invalid input");
}




}

}