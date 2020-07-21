/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Collections;
class Subarray_with_given_sum{
    public static int subArraySum(int arr[], int n, int sum) 
	{ 
		int curr_sum = arr[0], start = 0, i; 

		// Pick a starting point 
		for (i = 1; i <=n; i++) { 
			// If curr_sum exceeds the sum, 
			// then remove the starting elements 
			while (curr_sum > sum && start < i - 1) { 
				curr_sum = curr_sum - arr[start]; 
				start++; 
			} 

			// If curr_sum becomes equal to sum, 
			// then return true 
			if (curr_sum == sum) { 
				System.out.println(start+1+" "+i); 
				return 1; 
			} 
			// Add this element to curr_sum  
			curr_sum = curr_sum + arr[i]; 
		} 

		System.out.println("-1"); 
		return 0; 
	} 
    
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int test = sc.nextInt();
	    for(int i=0;i<test;i++){
	        int limit = sc.nextInt();
	        int sum = sc.nextInt();
	        int[] a = new int[limit];
	        for(int j=0;j<limit;j++){
	            a[j] = sc.nextInt();
	        }

	        subArraySum(a,a.length,sum);
	    }
	}
}