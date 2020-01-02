import java.util.Arrays;
import java.util.Scanner;

public class Solution{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int t = 1;t <= testcase;t++) {
			int N = sc.nextInt();
			String[] string = new String[N];
			for(int i = 0;i < N;i++) {
				string[i] = sc.next();
			}
			Arrays.sort(string);
			int s = -1;
			int count = 0;
			for(int i = 0;i < N;i++) {
				int n = string[i].charAt(0) - 'A';
				if(s+1 == n) {
					count++;
					s++;
				}else if(s == n){
					
				}
				else
					break;
			}
			System.out.printf("#%d %d\n",t,count);
		}
	}
}
