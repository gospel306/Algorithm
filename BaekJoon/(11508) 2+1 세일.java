import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int result = 0;
		int[] arr = new int[N];
		for(int i = 0;i < arr.length;i++) {
			arr[i] = sc.nextInt();
			result += arr[i];
		}
		Arrays.sort(arr);
		for(int i = N - 3;i >= 0;i -= 3)
			result -= arr[i];
		for(int i = 0;i < i% 3;i++)
			result -= arr[i];
		System.out.println(result);
	}
}
