import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int testcase = 1; testcase <= T;testcase++) {
			int N = sc.nextInt();
			Integer[] arr = new Integer[N];
			for(int i = 0;i < N;i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr,Collections.reverseOrder());
			int sum = 0,sum2 = 0, mult = -1;
			for(int i = 0;i < arr.length;i++) {
				for(int j = i+1;j < arr.length;j++) {
					boolean check = true;
					sum = arr[i]*arr[j];
					sum2 = sum;
					int a = sum%10;
					while(sum > 9) {
						sum/=10;
						int b = sum%10;
						int n = a - b;
						if(n != 1) {
							check = false;
							break;
						}
						a = b;
					}
					if(check && sum2 > mult) {
						mult = sum2;
					}
				}
			}
			System.out.println(mult);
		}
	}
}
