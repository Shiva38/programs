package capOnString;

import java.util.Scanner;

import java.util.*;
   
 
class MaximumumOccuringChar   
{   
 
  
 
  public static void main(String[] args)   
  {   
      String info = "Java is a programming language";  
 
      char str[] = info.toCharArray();  
      
      int len = str.length;   
       
     
      
         
           
          int index = 0;   
      
           
          for (int i = 0; i < len; i++)   
          {   
                
              
              int j;   
              for (j = 0; j < i; j++)    
              {   
                  if (str[i] == str[j])   
                  {   
                      break;   
                  }   
              }   
      
                
              if (j == i)    
              {   
                  str[index++] = str[i];   
              }   
          }   
          System.out.println(String.valueOf(Arrays.copyOf(str, index)));   
      }   
  }   
  