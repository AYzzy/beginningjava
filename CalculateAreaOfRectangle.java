
//Prompt user to enter width
//prompt user to enetr height
//To get the area of the rectangle multiply width against height
//To get the perimeter of the rectngle we add the width and height and multiply result by 2


import java.util.Scanner;

public class CalculateAreaOfRectangle{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter the width of a rectangle: ");
int width = input.nextInt();

System.out.println("Enter the : ");
int height = input.nextInt();
		
int area = width * height;
int perimeter = 2*(width + height);

System.out.println("The area of a rectangle when given the width as "
 + width + " and the height as "+ height + " = "+ area  );

System.out.println("The perimeter of a rectangle when given the width as "
 + width + " and the height as "+ height + " = "+ perimeter );	



}

}