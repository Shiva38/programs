package CapgPractice;
//Write  a Java Program to count number of duplicated values in Char


public class CountDuplicateOfChar {  
    public static void main(String[] args) {      
          
        //Initialize array   
        char[] arr =  {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'g','h'};   
          int count=0;
        System.out.println("Number Duplicate elements in given array: ");  
        //Searches for duplicate element  
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j]) 
                	count++;
                     
            }  
        }
        System.out.println(count);
    }  
} 
