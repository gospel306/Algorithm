import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		final String[] grade = {"A+","A0","A-","B+","B0","B-","C+","C0","C-","D0"};
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int t = 1;t <= testcase;t++) {
			int students = sc.nextInt();
			int check = sc.nextInt() - 1;
			Integer[] student = new Integer[students];
			
			for(int i = 0;i < students;i++) {
				int midterm = sc.nextInt();
				int term = sc.nextInt();
				int hw = sc.nextInt();
				student[i] = midterm*35 + term*45 + hw*20;
			}
			int find = student[check];
			Arrays.sort(student,Collections.reverseOrder());
			int st_rank = Arrays.asList(student).indexOf(find);
			System.out.println("#"+t+" "+grade[10*st_rank/students]);
		}
	}
}
