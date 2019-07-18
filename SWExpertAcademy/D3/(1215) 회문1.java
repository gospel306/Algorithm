import java.io.*;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int t = 1;t < 11;t++) {
			int N = Integer.parseInt(br.readLine());
			char[][] arr = new char[8][8];
			for(int i = 0;i < arr.length;i++) {
				String line = br.readLine();
				for(int j = 0;j < arr.length;j++)
					arr[i][j] = line.charAt(j);
			}
			int count = 0;
			for(int i = 0;i < arr.length;i++) {	
				go:
				for(int j = 0; j < arr.length - N + 1;j++) {
					for(int k = 0;k < N/2;k++) {
						if(arr[i][j+k] != arr[i][N + j - k - 1]) 
							continue go;
					}
					count++;
				}
			}
			for(int j = 0;j < arr.length;j++) {
				go:
				for(int i = 0;i < arr.length - N + 1;i++) {
					for(int k = 0;k < N/2;k++)
						if(arr[i + k][j] != arr[N+i-k-1][j])
							continue go;
					count++;
				}
			}
			System.out.println("#"+t+" "+count);
		}
	}
}
