import java.util.Scanner;

public class Solution {
	static long min;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int TC = 1;TC <= testcase;TC++) {
			long num = sc.nextLong();
			min = Integer.MAX_VALUE;
			Solution(0,num);
			System.out.println("#"+TC+" "+min);
		}
	}
	static void Solution(long depth,long num) {
		if(num == 2) {
			if(min > depth)
				min = depth;
			return;
		}else if(num < 2) {
			return;
		}
		long sq = (long)Math.sqrt(num);
		if(Math.sqrt(num) == sq)
			Solution(depth+1,sq);
		else {
			Solution((long)Math.pow(sq+1, 2)-num+depth,(long)Math.pow(sq+1, 2));
		}
	}
}
