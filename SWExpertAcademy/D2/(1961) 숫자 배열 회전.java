import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for (int t = 1; t <= testcase; t++) {
			int size = sc.nextInt();
			int[][] box = new int[size][size];
			int[][] box90 = new int[size][size];
			int[][] box180 = new int[size][size];
			int[][] box270 = new int[size][size];
			for (int i = 0; i < box.length; i++)
				for (int j = 0; j < box[i].length; j++)
					box[i][j] = sc.nextInt();
			for (int i = 0; i < box.length; i++)
				for (int j = 0; j < box.length; j++) {
					box90[i][j] = box[box.length - 1 - j][i];
					box180[i][j] = box[box.length - 1 - i][box.length - 1 - j];
					box270[i][j] = box[j][box.length - 1 - i];
				}
			System.out.println("#"+t);
			for (int i = 0; i < box.length; i++) {
				for (int j = 0; j < box.length; j++) {
					System.out.print(box90[i][j]);
				}
				System.out.print(" ");
				for (int j = 0; j < box.length; j++) {
					System.out.print(box180[i][j]);
				}
				System.out.print(" ");
				for (int j = 0; j < box.length; j++) {
					System.out.print(box270[i][j]);
				}
				System.out.println();
			}
		}
	}
}
