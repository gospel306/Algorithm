import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = 0;
		while(testcase < 10) {
			int dump = sc.nextInt();
			int[] box = new int[100];
			int result = 0;
			for(int i = 0;i < box.length;i++) {
				box[i] = sc.nextInt();
			}
			Arrays.sort(box);
			for(int i = 0;i < dump;i++) {
				box[0]++;
				box[99]--;
				Arrays.sort(box);
			}
			result = box[99] - box[0];
			testcase++;
			System.out.printf("#%d %d\n", testcase,result);
		}
	}
}
