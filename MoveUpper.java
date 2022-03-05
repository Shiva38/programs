package capOnString;
import java.util.*;

import java.util.Scanner;

public class MoveUpper
{ 
 
   void fetchTheString(String inputstring) 
   {   
 int j;
       int lengthOfstring = inputstring.length(); 
       String alplower = ""; 
       String alpupper = ""; 
       char temp; 
       for (j = 0; j < lengthOfstring; j++) { 
           temp = inputstring.charAt(j);  
           if (temp >= 'A' && temp <= 'Z') { 
                alpupper+= temp; 
           } 
           else { 
               alplower += temp; 
           } 
       } 
       System.out.println(alplower + alpupper); 
   } 
 
   public static void main(String args[]) 
   { 
       String inputstring;
 Scanner in=new Scanner(System.in);
 System.out.println("Enter the String:");
 inputstring=in.next();
 MoveUpper ce=new MoveUpper();
 ce.fetchTheString(inputstring);

   } 
}
