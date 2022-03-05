package capOnArrays;

import java.util.Arrays;
import java.util.Scanner;

class SubArray{

public static void main(String args[]){
    int m;  
    Scanner sc=new Scanner(System.in);  
    System.out.print("Enter the number of elements you want to store: ");  

          m=sc.nextInt();  

                int[] a = new int[10];  
                System.out.println("Enter the elements of the array: ");  
               for(int i=0; i<m; i++)  
            {  

              a[i]=sc.nextInt();  
            }





            int[] sub = Arrays.copyOfRange(a,3,9);

                     System.out.println("Array is : ");

                     for(int i = 0; i < a.length; i++){

                    System.out.println(a[i]+"\t");

                 }

                      System.out.println("SubArray is : ");

                     for(int i = 0; i < sub.length; i++){

                System.out.print(sub[i]+"\t");

                }

                 }

                    } 
