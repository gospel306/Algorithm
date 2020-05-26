import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	static int[] arr;
	static int min;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		arr = new int[N];
		for (int i = 0; i < N; i++)
			arr[i] = sc.nextInt();
		min = 0;
		for (int i = 0; i < N; i++) {
			int n = arr[i];
			if (n == 1) {
				Solution(2, i);
				Solution(3, i);
			} else if (n == 2) {
				Solution(1, i);
				Solution(3, i);
			} else if (n == 3) {
				Solution(1, i);
				Solution(2, i);
			}
		}
		System.out.println(N-min);
	}

	static void Solution(int n, int a) {
		int color = arr[a];
		arr[a] = n;
		int left = a;
		int right = a;
		int max = 0;
		int now;
		while(left >= 0 && right < arr.length && arr[left] == arr[right]) {
			int tmp = 0;
			now = arr[left];
			while(left >= 0 && arr[left] == now) {
				left--;
				tmp++;
			}
			while(right < arr.length &&arr[right] == now) {
				right++;
				tmp++;
			}
			if(tmp >= 4)
				max += tmp;
		}
		if(min < max)
			min = max - 1;
		arr[a] = color;
	}
}
