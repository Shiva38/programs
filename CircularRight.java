package capOnArrays;

import java.util.Arrays;

public class CircularRight
{
    static int ar[] = new int[]{1, 2, 3, 4, 5};
     
    // Method for rotation
    static void rotate()
    {
       int x = ar[ar.length-1], i;
       for (i = ar.length-1; i > 0; i--)
          ar[i] = ar[i-1];
       ar[0] = x;
    }
     
    /* Driver program */
    public static void main(String[] args)
    {
        System.out.println("Given Array is");
        System.out.println(Arrays.toString(ar));
         
        rotate();
         
        System.out.println("Rotated Array is");
        System.out.println(Arrays.toString(ar));
    }
}
