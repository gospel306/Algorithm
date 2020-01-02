import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		int[] sectime = {3600,60,1};
		for(int t = 1;t<=testcase;t++) {
			String[] presentTime = sc.next().split(":");
			String[] promissTime = sc.next().split(":");		
			int present = 0, promiss = 0, answer = 0;
			for(int i=0;i<3;i++) {
				present += Integer.parseInt(presentTime[i])*sectime[i];
				promiss += Integer.parseInt(promissTime[i])*sectime[i];
			}
			answer = promiss + (promiss > present ? 0 : 24*sectime[0]) - present;
			System.out.printf("#%d ",t);
			for(int i=0;i<3;i++) {
				System.out.printf("%02d%s",answer/sectime[i],i == 2 ? "\n":":");
				answer %= sectime[i];
			}
		}
	}
}
