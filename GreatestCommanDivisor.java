package capPractice1;

import java.util.Scanner;

public class GreatestCommanDivisor {
	  
    public static void main(String args[]){
     
             
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number to find GCD");
        int number1 = scanner.nextInt();
        System.out.println("Please enter second number to find GCD");
        int number2 = scanner.nextInt();
      
        System.out.println("GCD of two numbers " + number1 +" and " 
                           + number2 +" is :" + findGCD(number1,number2));
      
      
    }

    
    private static int findGCD(int number1, int number2) {
        
        if(number2 == 0){
            return number1;
        }
        return findGCD(number2, number1%number2);
    }
  
}


