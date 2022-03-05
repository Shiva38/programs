package CapgPractice;

import java.util.Arrays;
import java.util.Scanner; 
//write a Java program to remove an element by taking an index from the user?
public class RemoveByIndex{
 
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Index  :  ");
	int a=sc.nextInt();
   int[] my_array = {10, 21, 52, 50, 55, 70, 88, 44, 15, 62};
   
   System.out.println("Original Array : "+Arrays.toString(my_array));     
   
  // Remove the second element (index->1, value->14) of the array
  // int removeIndex = 1;

   for(int i = a; i < my_array.length -1; i++){
        my_array[i] = my_array[i + 1];
      }
// We cannot alter the size of an array , after the removal, the last and second last element in the array will exist twice
    System.out.println("After removing the second element: "+Arrays.toString(my_array));
 }
 }
