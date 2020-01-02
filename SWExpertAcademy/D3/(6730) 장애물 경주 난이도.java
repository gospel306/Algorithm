import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for (int t = 1; t <= testcase; t++) {
			int num = sc.nextInt();
			int max = 0, min = 0;
			int[] box = new int[num];
			for (int i = 0; i < num; i++) {
				box[i] = sc.nextInt();
			}
			for (int i = 1; i < num; i++) {
				if (box[i] > box[i - 1] && max < box[i] - box[i - 1])
					max = box[i] - box[i - 1];
				else if (box[i] < box[i - 1] && min < box[i - 1] - box[i])
					min = box[i - 1] - box[i];
			}
			System.out.println("#"+t+" "+max + " " + min);
		}
	}
}
