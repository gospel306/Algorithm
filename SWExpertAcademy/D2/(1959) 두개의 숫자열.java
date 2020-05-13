import java.util.Scanner;

public class Solution1959 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int testcase = 1;testcase <= T;testcase++) {
			int an = sc.nextInt();
			int bn = sc.nextInt();
			int[] arr = new int[an];
			int[] arr2 = new int[bn];
			for(int i = 0;i < arr.length;i++)
				arr[i] = sc.nextInt();
			for(int i = 0;i < arr2.length;i++)
				arr2[i] = sc.nextInt();
			int n = 0,sum = 0, answer = 0;
			if(an > bn) {
				n = an - bn;
				for(int i = 0;i <= n;i++) {
					for(int j = 0;j < arr2.length;j++) {
						sum += arr[j+i]*arr2[j];
					}
					if(answer < sum)
						answer = sum;
					sum = 0;
				}
			}else {
				n = bn - an;
				for(int i = 0;i <= n;i++) {
					for(int j = 0;j < arr.length;j++) {
						sum += arr[j]*arr2[j+i];
					}
					if(answer < sum)
						answer = sum;
					sum = 0;
				}
			}
			System.out.println("#"+testcase+" "+answer);
		}
	}
}
