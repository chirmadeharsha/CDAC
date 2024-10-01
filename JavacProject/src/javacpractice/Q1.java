import java.util.Scanner;
package javacpractice;

import java.util.Arrays;

public class Q1{

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter String");
        int count=0;
        while(sc.hasNext()) {
           String word=sc.nextLine();
           char[] arr=word.toCharArray();
           
           Arrays.sort(arr);
           if(count%2==0) {
        	   for (int i=0;i<arr.length;i++) {
        		   System.out.println((char)arr[i]);
    
        	   }
        	   System.out.println();
           }
           else
           {
        	   for(int i=arr.length-1;i>=0;i--) {
        		   System.out.println((char)arr[i]);
        	   }
        	   System.out.println();
}
      count++;
           }
        }

	}


