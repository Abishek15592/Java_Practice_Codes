
import java.util.*;
import java.lang.*;
import java.io.*;

class Parenthesis {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int flag =0;
		int test = sc.nextInt();
		for(int j=0;j<test;j++){
		    String str = sc.next();
		Stack<Character> st = new Stack<Character>();
		for(int i=0;i<str.length();i++){
		    char ch = str.charAt(i);
		    if(ch=='('){
		        st.push(ch);
		    }else if(ch=='{'){
		        st.push(ch);
		    }else if(ch=='['){
		        st.push(ch);
		    }
		    
		    else if(ch==')'){
		        if(!st.isEmpty() && st.peek()=='('){
		            st.pop();
		        }
		        
		        else{
		            flag = -1;
		            break;
		        }
		    }
		    
		    else if(ch=='}'){
		        if(!st.isEmpty() && st.peek()=='{'){
		            st.pop();
		        }
		        
		        else{
		            flag = -1;
		            break;
		        }
		    }
		    
		    else if(ch==']'){
		        if(!st.isEmpty() && st.peek()=='['){
		            st.pop();
		        }
		        
		        else{
		            flag = -1;
		            break;
		        }
		    }
		}
		
		if(!st.isEmpty() || flag==-1){
		    System.out.println("not balanced");
		}
		
		else{
		    System.out.println("balanced");
		}
		}
		
	}
}