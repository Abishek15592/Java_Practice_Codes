import java.util.*;


class Flood_fill{

	public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
		int color = image[sr][sc];
		if(color != newColor)
		helper(image,sr,sc,newColor,color);
		return image;
	}


	public static void helper(int image[][], int i, int j, int newColor, int color){
	
		if(i<0||j<0||i>=image.length|| j>=image[0].length||image[i][j] != color) return ;	
		image[i][j] = newColor;
	
	
		helper(image, i+1, j, newColor, color);
		helper(image, i-1, j, newColor, color);
		helper(image, i, j+1, newColor, color);
		helper(image, i, j-1, newColor, color);
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int test = sc.nextInt(); test>0; test--){
			int m = sc.nextInt();
			int n = sc.nextInt();
			int a[][] = new int[m][n];
			for(int i = 0; i<m; i++) {
				for(int j=0;j<n;j++) {
					a[i][j]=sc.nextInt();
				}
			}
		
			a=floodFill(a,sc.nextInt(),sc.nextInt(),sc.nextInt());
			for(int i=0; i<m; i++) {
				for(int j=0;j<n;j++) {
					System.out.print(a[i][j]);
				}
				System.out.println();
			}
		}
	}
}