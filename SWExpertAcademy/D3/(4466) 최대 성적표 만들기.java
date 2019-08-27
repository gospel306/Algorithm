import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int t = 1;t <= testcase;t++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			Integer[] score = new Integer[N];
			int result = 0;
			for(int i = 0;i < score.length;i++)
				score[i] = sc.nextInt();
			Arrays.sort(score, Collections.reverseOrder());
			
			for(int i = 0;i<K;i++)
				result += score[i];
			System.out.println("#"+t+" "+result);
		}
	}
}
