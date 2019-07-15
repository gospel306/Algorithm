import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for (int i = 0; i < testcase; i++) {
			String s = sc.next();
			int count = 0;
			for(int j = 1;j<10;j++) {
				String temp = s.substring(0, j);
				String check = s.substring(j, j+j);
				if(temp.equals(check)) {
					count = j;
					break;
				}
			}
			System.out.printf("#%d %d\n",i+1,count);
		}
	}
}
