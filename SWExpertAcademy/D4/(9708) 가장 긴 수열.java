import java.util.Arrays;
import java.util.Scanner;

public class Solution9708 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int testcase = 1;testcase <= T;testcase++) {
			int N = sc.nextInt();
			int[] a = new int[N];
			int[] arr = new int[1000001];
			int num = 0;
			for(int i = 0;i < N;i++) {
				a[i] = sc.nextInt();
				arr[a[i]] = 1;
			}
			Arrays.sort(a);
			for(int i = 0;i < N;i++) {
				for(int j = a[i]*2;j <= a[N-1];j+=a[i]) {
					arr[j] = Math.max(arr[j], arr[a[i]]+1);
				}
			}
			for(int i = 0;i < N;i++)
				num = Math.max(num, arr[a[i]]);
			System.out.println("#"+testcase+" "+num);
		}
	}
}
