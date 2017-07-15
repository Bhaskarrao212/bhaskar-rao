package MainCalc;

import java.util.Scanner;
import com.calc.simplecalc.*;
public class MainCalc
	{
		public static void main(String[] args) 
		{
			int a,b,c;
			SimpleCalc s = new SimpleCalc(); 
			Scanner sc =new Scanner(System.in);
			System.out.print("Enter first number : " );
			a = sc.nextInt();
			System.out.print("Enter second number : " );
			b = sc.nextInt();
				
			
			System.out.print("1.Addition\n");
			System.out.print("2.Subtraction\n");
			System.out.print("3.Multiplication\n");
			System.out.print("4.Division\n");
			System.out.print("Enter your choice : ");
			System.out.print("");
			int choice = sc.nextInt();
			
			switch (choice) 
				{
            case 1:
               
                System.out.println("Addition is " +s.addition(a,b));
                break;
 
            case 2:
               
                System.out.println("Substraction  is " +s.substraction(a, b) );
                break;
 
            case 3:
                
                System.out.println("Multiplication is " +s.multiplication(a, b));
                break;
 
            case 4:
               
                System.out.println("Division  is " +s.division(a, b) );
                break;
				}
			
			}
		
		}


	
			
		
