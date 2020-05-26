import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = Integer.parseInt(sc.nextLine().trim());
		for(int t = 0;t < testcase;t++) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i = 0;i < n;i++)
				arr[i] = sc.nextInt();
			long result = 0;
			for(int i = 0;i < n-1;i++) {
				for(int j = i+1;j < n;j++) {
					result += gcd(arr[i],arr[j]);
				}
			}
			System.out.println(result);
		}
	}
	static int gcd(int a,int b) {
		return a%b == 0?b:gcd(b,a%b);
	}
}
