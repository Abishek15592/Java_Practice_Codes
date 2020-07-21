import java.util.*;

public class DFS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
			int vertices = sc.nextInt();
			int edges = sc.nextInt();
			
			for(int i=0;i<vertices;i++) {
				graph.add(i,new ArrayList<Integer>());
			}
			
			for(int i=0;i<edges;i++) {
				int u = sc.nextInt();
				int v = sc.nextInt();
				graph.get(u).add(v);
				graph.get(v).add(u);
			}
			
			ArrayList<Integer> ans = traversal(graph,vertices);
			
			for(int i=0;i<ans.size();i++) {
				System.out.print(ans.get(i)+" ");
			}
			
			System.out.println();
			
		}

	}
	
	public static ArrayList<Integer> traversal(ArrayList<ArrayList<Integer>> graph , int vertices){
		
		boolean arr[] = new boolean[vertices+1];
		Arrays.fill(arr, false);
		ArrayList<Integer> ans = new ArrayList<>();
		ans.add(0);
		DFS_implementation(graph,arr,0,ans);
		return ans;		
	}
	
	public static void DFS_implementation(ArrayList<ArrayList<Integer>> graph ,boolean arr[],int index,ArrayList<Integer> ans) {
		arr[index] = true;
		
		for(int i : graph.get(index)) {
			if(arr[i]!=true) {
				ans.add(i);
				DFS_implementation(graph,arr,i,ans);
			}
		}
	}

}
