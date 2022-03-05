package CapgPractice;

import java.util.Scanner;

public class CountChar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE STRING");
		int count=0;
		String s=sc.nextLine();
		String[] split=s.split(" ");
		
		for(String w:split) {
			
			count=count+1;
			
			
		
	}
		System.out.println(count);
		

}
}
