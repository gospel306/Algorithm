import java.util.Scanner;

public class Solution7965 {
	static long pow(int a,int b) {
		if(b == 1)
			return a;
		long tmp = pow(a, b/2);
		if(b%2 == 0)
			return tmp*tmp%1000000007;
		else
			return tmp*tmp%1000000007*a%1000000007;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		long[] nums = new long[1000001];
		for(int i = 1;i <=1000000;i++)
			nums[i] = (nums[i-1]+ pow(i,i))%1000000007;
		for(int testcase = 1;testcase <= T;testcase++) {
			int N = sc.nextInt();
			System.out.println("#"+testcase+" "+nums[N]);
		}
	}
}
