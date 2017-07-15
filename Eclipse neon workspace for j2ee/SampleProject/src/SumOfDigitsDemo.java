

import java.util.Scanner;
 
public class SumOfDigitsDemo {
 
    public static void main(String[] args) {
 
        Integer number;
 
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Enter the number whose" +
                " sum of digits is to be calculated : ");
 
        number = scanner.nextInt();
 
        System.out.println("Number entered : " + number);
 
        int sum = 0;
 
        while(number > 0) {
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
 
        System.out.println("The sum of the digits of the" +
                " number entered : " + sum);       
    }
}