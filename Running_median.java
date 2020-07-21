
import java.util.*;
import java.util.Collections;
import java.lang.*;
import java.io.*;

class Running_median{
    
    public static void add(int number,PriorityQueue<Integer> lower,PriorityQueue<Integer> higher){
        if(lower.size() == 0 || number<lower.peek()){
            lower.add(number);
        }
        
        else{
            higher.add(number);
        }
    }
    
    public static void reshape(PriorityQueue<Integer> lower,PriorityQueue<Integer> higher){
        PriorityQueue<Integer> larger = lower.size()>higher.size()?lower:higher;
        PriorityQueue<Integer> smaller = lower.size()>higher.size()?higher:lower;
        
        if(larger.size() - smaller.size() >=2){
            smaller.add(larger.poll());
        }
    }
    
    public static int calculate_median(PriorityQueue<Integer> lower,PriorityQueue<Integer> higher){
        PriorityQueue<Integer> larger = lower.size()>higher.size()?lower:higher;
        PriorityQueue<Integer> smaller = lower.size()>higher.size()?higher:lower;
        
        if(larger.size() == smaller.size()){
            return (larger.peek()+smaller.peek())/2;
        }
        
        else{
            return larger.peek();
        }
    }
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		PriorityQueue<Integer> higher = new PriorityQueue<Integer>();
		PriorityQueue<Integer> lower = new PriorityQueue<Integer>(Collections.reverseOrder());
		int n = sc.nextInt();
	    for(int i=0;i<n;i++){
	        int number = sc.nextInt();
	        add(number,lower,higher);
	        reshape(lower,higher);
	        int ans = calculate_median(lower,higher);
	        
	        System.out.println(ans);
	    }
	}
}