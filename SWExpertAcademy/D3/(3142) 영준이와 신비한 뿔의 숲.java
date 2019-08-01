import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int t = 1;t <= testcase;t++) {
		int N = sc.nextInt();
		int M = sc.nextInt();
		System.out.println("#"+t+" "+(M*2 - N) + " " + (M - ((M*2) - N)));
		}
	}
}
