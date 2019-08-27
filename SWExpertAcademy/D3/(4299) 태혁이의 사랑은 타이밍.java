import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int t = 1;t <= testcase;t++) {
			int D = sc.nextInt();
			int H = sc.nextInt();
			int M = sc.nextInt();
			int time = (11*24 + 11)*60 + 11;
			int	result = (D*24 + H)*60 + M;
			if(result < time)
				result = -1;
			else
				result -= time;
			System.out.println("#"+t+" "+result);
		}
	}
}
