import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	static int[] kyu, temp;
	static int win;
	static int ksum;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		kyu = new int[9];
		int[] young = new int[9];
		boolean[] check = new boolean[19];
		int testcase = sc.nextInt();
		for (int t = 1; t <= testcase; t++) {
			Arrays.fill(check, false);
			win = 0;
			check[0] = true;
			for (int i = 0; i < 9; i++) {
				kyu[i] = sc.nextInt();
				check[kyu[i]] = true;
			}
			int cnt = 0;
			for (int i = 0; i < 19; i++) {
				if (check[i] != true)
					young[cnt++] = i;
			}
			temp = new int[9];
			factorial(young, 0);
			int lose = 362880 - win;
			System.out.println("#"+t+" "+win + " " + lose);
		}
	}

	public static void factorial(int[] arr, int index) {
		if (index == 9) {
			ksum = 0;
			for (int i = 0; i < 9; i++) {
				if (kyu[i] > arr[i])
					ksum = kyu[i] + arr[i] + ksum;
			}
			if (ksum >= 86)
				win++;
			ksum = 0;
			return;
		}
		for (int i = index; i < 9; i++) {
			swap(arr, i, index);
			factorial(arr, index + 1);
			swap(arr, i, index);
		}
	}
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
