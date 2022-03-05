package capOnString;

import java.util.Scanner;

public class ReapetedWords{
    public static void main(String args[]) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the String");
    
      String input = sc.next();
     
      input = input.toLowerCase();
     
      String[] words = input.split(" ");
      int length = words.length;
      
      for( int i=0; i < length; i++)
      {
        
          int count = 1;
          for(int j=i+1; j < length; j++)
          {
              if(words[i].equals(words[j]))
              {
                  count++;
                 
                  words[j] = "0";
              }
          }
          if (words[i] != "0" && count > 1)
              System.out.print(" "+words[i]+" ");
      }
    }
}
