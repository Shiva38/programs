package capOnArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Split {  
         public static void main(String[] args){  
                     int m;  
                    Scanner sc=new Scanner(System.in);  
                    System.out.print("Enter the number of elements you want to store: ");  
 
                          m=sc.nextInt();  

                                int[] inp = new int[10];  
                                System.out.println("Enter the elements of the array: ");  
                               for(int i=0; i<m; i++)  
                            {  
    
                               inp[i]=sc.nextInt();  
                            }  
                               
                               int k = inp.length;
                        
                               int[] a = new int[(k + 1)/2];
                               int[] b = new int[k- a.length];
                        
                               for (int i = 0; i < k; i++)
                               {
                                   if (i < a.length) {
                                       a[i] = inp[i];
                                   }
                                   else {
                                       b[i - a.length] = inp[i];
                                   }
                               }
                        
                               System.out.println(Arrays.toString(a));
                               System.out.println(Arrays.toString(b));
                           }
                             
                 
                }  

