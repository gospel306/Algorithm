import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = Integer.parseInt(sc.nextLine());
		int n = 0;
		int[] maxMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
		while(n < testcase) {
			String date = sc.nextLine();
			String year = date.substring(0,4);
			int num = Integer.parseInt(date.substring(4));
			int month = num/100;
			int day = num%100;
			n++;
			if(month>maxMonth.length || month < 1)
				System.out.printf("#%d -1\n",n);
			else {
				if(day < 1 || day > maxMonth[month-1])
					System.out.printf("#%d -1\n",n);
				else {
					System.out.printf("#%d %s/%02d/%02d\n", n,year,month,day);
				}
			}
		}
	}
}
