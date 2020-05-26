import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0;i < n;i++) {
			int s = sc.nextInt();
			int[] arr = new int[s];
			int sum = 0;
			for(int j = 0;j < s;j++) {
				arr[j] = sc.nextInt();
				sum += arr[j];
			}
			int b = sum/s;
			int count = 0;
			for(int j = 0;j < s;j++) {
				if(arr[j] > b)
					count++;
			}
			double c = (double)count/s*100;
			System.out.printf("%.3f%%\n",c);
		}
	}
}
