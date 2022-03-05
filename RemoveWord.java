package capOnString;


import java.io.*;
import java.util.Scanner;

class RemoveWord {
	 
   
    public static void main(String[] args)
    {
      
        String str = "This is the kitchen";
 
       
        String word = "is";
 
       
        str = str.replaceAll("is", "");
 
        
        str = str.trim();
 
  
        System.out.print(str);
    }
}
