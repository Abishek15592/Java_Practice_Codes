/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Reversing{
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int test = sc.nextInt();
		while(test>0){
		    String input = sc.next(); 
            // input=input.replace("."," ");
            String[] arr = input.split("\\.");
            // System.out.println(arr[0]);

            for(int i= arr.length-1;i>0;i--){
                System.out.print(arr[i] + ".");
            }
            System.out.print(arr[0]);
            System.out.println();
            test--;
		}
	}
}