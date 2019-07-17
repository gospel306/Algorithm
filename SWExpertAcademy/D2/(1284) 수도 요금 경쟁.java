import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int t = 1;t <= testcase;t++) {
			int liter_per_price = sc.nextInt();
			int min_price = sc.nextInt();
			int limit_liter = sc.nextInt();
			int over_price = sc.nextInt();
			int liter = sc.nextInt();
			int priceA = 0,priceB = 0;
			
			priceA = liter*liter_per_price;
			if(liter <= limit_liter)
				priceB = min_price;
			else
				priceB = min_price + (liter - limit_liter)*over_price;
			if(priceA < priceB)
				System.out.printf("#%d %d\n",t,priceA);
			else
				System.out.printf("#%d %d\n", t,priceB);
		}
	}
}
