import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int t = 1;t<=testcase;t++) {
			int[] score = new int[5];
			int sum = 0;
			for(int i = 0;i<5;i++)
				score[i] = sc.nextInt();
			for(int i = 0;i < 5;i++) {
				if(score[i] < 40)
					score[i] = 40;
				sum += score[i];
			}
			System.out.println("#"+t+" "+sum/5);
		}
	}
}
