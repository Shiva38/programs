package capOnString;

import java.util.Scanner;


public class NumberOfWords {
	 
    public static void main(String[] args) {
        String str = "Java is programming language";
 
         System.out.println(countWord(str));
    }
 
    public static int countWord(String str) {
        int wordCount = 1;
        int len = str.length();
 
        for(int i = 0; i < len-1; i++) {
 
           if(str.charAt(i) == ' ' && str.charAt(i+1) != ' ') { 
                wordCount++;
           }
        }
 
        return wordCount;
    }
}
