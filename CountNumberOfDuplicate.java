package CapgPractice;
//Write  a Java Program to count number of duplicated values in


public class CountNumberOfDuplicate {  
    public static void main(String[] args) {      
          
        //Initialize array   
        int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};   
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
