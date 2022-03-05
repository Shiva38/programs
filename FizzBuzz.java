package capPractice1;

public class FizzBuzz {
	public static String fizzBuzz2(int number) 
	{
		if (number % 15 == 0)
		{ 
			return "fizzbuzz"; 
			} 
		else if (number % 5 == 0) 
		{ 
			return "buzz"; 
			}
		else if (number % 3 == 0) { 
			return "fizz"; 
			} 
		return String.valueOf(number); 
		}
	public static void main(String[] args) {
	String a =FizzBuzz.fizzBuzz2(5);
	System.out.println(a);
	}

	
}
