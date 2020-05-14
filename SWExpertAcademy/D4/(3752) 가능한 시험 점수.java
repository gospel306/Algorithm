import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int t = 1;t <= testcase;t++) {
			int N = sc.nextInt();
			boolean[] num = new boolean[10001];
			num[0] = true;
			int count = 1;
			for(int i = 0;i < N;i++) {
				int n = sc.nextInt();
				for(int j = 10000; j >= 0; j--) {
					if(num[j] == true && j+n<=10000 && num[j+n]== false) {
						num[j+n] = true;
						count++;
					}
				}
			}		
			System.out.println("#"+t+" "+count);
		}
	}
}
