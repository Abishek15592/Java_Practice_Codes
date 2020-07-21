//Minimum operation with Double the number
// or Add one to the number

import java.util.*;
import java.lang.*;
import java.io.*;

class Minimum_Operation {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int n=sc.nextInt(),count=0;
		    while(n!=0)
		    {
		        if(n%2==0)
		            count+=1;
		        else if(n!=1)
		            count+=2;
		        else 
		        	count+=1;
		        n/=2;
		        
		    }System.out.println(count);
		}
	}
}