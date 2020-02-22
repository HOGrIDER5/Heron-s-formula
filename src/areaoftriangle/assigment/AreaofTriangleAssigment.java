/*
Amer Stas.
2/21/2020.
This program will calculate the area of a triangle using Heron's law or using trigonometry.
*/
package areaoftriangle.assigment;
import java.util.Scanner;
public class AreaofTriangleAssigment {
 public static void main(String[] args) {
     Scanner input= new Scanner (System.in);                     // to allows the user to enter values into the program.
     System.out.println(" Hi there, this program will calculate the the area of a scalene triangle ");
     System.out.println(" Option 1 will use trigonometry ");
     System.out.println(" Option 2 will use Heron's formula");
     System.out.println(" Enter any number other than 1 and 2 to exsit the program");
     System.out.println(" Please enter your option"); 
     int option;
     option = input.nextInt();                                   // Letting the user input the option they want.
     if (option == 1){
            System.out.println(" Please enter the side 1 ");
            double side1;
            side1 = input.nextDouble();                          // User inputs the first side of the triangle.
            System.out.println(" Please enter the side 2 ");
            double side2;
            side2 = input.nextDouble();                          // User inputs the second side of the triangle.
            System.out.println(" Please Enter the angle that is between the two sides");
            double angle;
            angle = input.nextDouble();                         // User inputs the angle between the two sides.
            System.out.println(" Doing some calculations ....");
            double area;
            area = ((side1 * side2 * Math.sin(angle))/2 );      // By using the ((a*b*Sin(C))/2) formula, the program can calculate the area of triangle
            System.out.println(" The area of the triangle is  " + area);
    }
     if(option ==2){                                                                        
            System.out.println(" Enter the side 1 ");
            double sid1;                                       
            sid1 = input. nextDouble();                          // User inputs the first side of the triangle.
            System.out.println(" Enter the side 2");        
            double sid2;                                        
            sid2= input.nextDouble();                            // User inputs the second side of the triangle.
            System.out.println(" Enter the side 3 ");
            double sid3;
            sid3 = input.nextDouble();                          // User inputs the third side of the triangle.
            double semi = (sid1+sid2+sid3)/2;                   // Programs uses the s = (a+b+c)/2 formula to find the semi-perimeter.
            System.out.println(" the area of the triangle is "+ Math.sqrt(semi*(semi-sid1)*(semi-sid2)*(semi-sid3)));   // Program uses Heron's formula to calculate for the area of the triagnle.
     }
     if (option != 2 && option != 1 ){                          // User can exsit from the program.
            System.out.println(" have a good day");
     }
    
}
}