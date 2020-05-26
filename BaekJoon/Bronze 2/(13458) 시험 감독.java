import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i < n;i++)
			arr[i] = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		long count = 0;
		for(int i = 0;i < n;i++) {
			arr[i] -= b;
			count++;
			if(arr[i] > 0)
				count += Math.ceil(1.0*arr[i]/c);
		}
		System.out.println(count);
	}
}
