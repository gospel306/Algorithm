import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int t = 1;t <= testcase;t++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int K = sc.nextInt();
			int time = 1;
			int product = 0;
			int[] person = new int[N];
			String check = "Possible";
			for(int i = 0;i < N;i++) 
				person[i] = sc.nextInt();
			Arrays.sort(person);
			for(int i = 0;i < person.length;i++) {
				for(int j = time;j <= person[i];j++) {
					if(j%M == 0)
						product += K;
				}
				product--;
				if(product < 0)
					check = "Impossible";
				time = person[i]+1;
			}
			System.out.println("#"+t+" "+check);
		}
	}
}
