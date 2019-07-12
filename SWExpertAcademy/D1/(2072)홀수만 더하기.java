import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		int num,sum = 0;
		for(int i = 0;i < testcase;i++) {
			for(int j = 0;j<10;j++) {
				num = sc.nextInt();
				if(num % 2 == 1)
					sum += num;
			}
			System.out.printf("#%d %d\n",(i+1),sum);
      			sum = 0;
		}
	}
}
