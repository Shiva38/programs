package capOnArrays;

import java.util.Scanner;

class TwentyIntegers{
	  public static void main(String[] args){
	    Scanner s = new Scanner(System.in);
	    int[] z = new int[20];
	    int p = 0;
	    int n = 0;
	    int o= 0;
	    int e = 0;
	    int zero = 0;
	    for(int i = 0;i<z.length;i++){
	      System.out.println("Print the value of index position["+i+"]");
	      z[i] = s.nextInt();

	      if(z[i]>0){
	        p++;
	      }
	      else if(z[i]<0){
	        n++;
	      }
	      else{
	        zero++;
	      }
	      if(z[i]%2==0){
	        e++;
	      }
	      else{
	        o++;
	      }
	    }
	    System.out.println("Positive : "+p+"\nNegative : "+n+"\nZero : "+z+"\nodd : "+o+"\neven : "+e);
	  }
	}
