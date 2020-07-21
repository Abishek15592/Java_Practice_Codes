
import java.util.*;
import java.lang.*;
import java.io.*;

/* 1)Sort according to finish times (in asc order).
   2)If start time of the next activity is greater than or equal to the end time of prev activity
then increment count.
*/

class Activity_Selector {
    
    static class pair{
         int start;
         int finish;
    }
    
    static class CustomSort implements Comparator<pair>
    {
        public int compare(pair p1,pair p2)
        {
            if(p1.finish>p2.finish) return 1;
            
            return -1;
        }
    }
		public static void main (String[] args) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    while(t-->0)
	    {
	        int n = Integer.parseInt(br.readLine());
	        int s[] = new int[n];
	        int f[] = new int[n];
	        String s1[] = br.readLine().split(" ");
	        String s2[] = br.readLine().split(" ");
	        
	        for(int i=0;i<n;i++)
	            s[i] = Integer.parseInt(s1[i]);
	            
	        for(int i=0;i<n;i++)
	            f[i] = Integer.parseInt(s2[i]);
	            maxMeetings(s,f,n);
	    }
		}
		
		static void maxMeetings(int s[],int f[],int n)
		{
		   ArrayList<pair>al = new ArrayList<>();
		   for(int i=0;i<n;i++)
		   {
		       pair p = new pair();
		       p.start = s[i];
		       p.finish = f[i];
		       al.add(p);
		       
		   }
		   
		   Collections.sort(al,new CustomSort());
		   
		   int end = Integer.MIN_VALUE;
		   int count =0;
		   for(int i=0;i<al.size();i++)
		   {
		       pair p = al.get(i);
		        if(p.start >= end)
		       {
		          count++;
		          end = p.finish;
		       }
		      
		   }
		   
		   System.out.println(count);
		}
}