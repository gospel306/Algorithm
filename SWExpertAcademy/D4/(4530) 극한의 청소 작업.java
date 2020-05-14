import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int t = 1;t <= testcase;t++) {
			long low = sc.nextLong();
			long high = sc.nextLong();
			long result = 0;
			if(low < 0 && high > 0) {
				result = solution(high) + solution(low) -1;
			}else if((low > 0 && high > 0) || (low < 0 && high < 0))
				result = Math.abs(solution(high) - solution(low)) ;
			System.out.println("#"+t+" "+result);
		}
	}
	static long solution(long num) {
		long temp = Math.abs(num);
		int numlength = 0;
		while(temp > 0) {
			temp /= 10;
			numlength++;
		}
		temp = Math.abs(num);
		long sum = 0;
		while(numlength>0) {
			long t = (long) Math.pow(10, numlength-1);
			int h = (int) (temp/t);
			temp %= t;
			
			if(h > 4) {
				sum += (h-1) * Math.pow(9, numlength-1);
			}else
				sum += h * Math.pow(9, numlength-1);
			numlength--;
		}
		return sum;
	}
}
