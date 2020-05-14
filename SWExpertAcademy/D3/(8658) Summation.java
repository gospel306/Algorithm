import java.util.Scanner;

public class Solution8658 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int testcase = 1;testcase <= T;testcase++) {
			int min = Integer.MAX_VALUE;
			int max = 0;
			for(int i = 0;i < 10;i++) {
				int num = sc.nextInt();
				int sum = 0;
				while(num>9){
					sum += num%10;
					num /= 10;
				}
				sum += num;
				if(sum < min)
					min = sum;
				if(sum > max)
					max = sum;
			}
			System.out.println("#"+testcase+" "+max+" "+min);
		}
	}
}
