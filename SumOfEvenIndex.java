package CapgPractice;

//Write a Java Program to find sum of numbers 
//a) even index

class SumOfEvenIndex {
     
    // Function to calculate sum
    // of even numbers at even indices
    public static void main(String[] args) {
    	 int i = 0, sum = 0;
    	 int arr[] = {5, 6, 12, 1, 18, 8};
         int n = arr.length;
         
         // calculating sum of even
         // number at even index
         for (i = 2; i < n; i+=2) {
          
            
                 sum += arr[i];
             
         }
         System.out.println(sum);
          
        
        
    }
  
}
     
      
 
    
 

