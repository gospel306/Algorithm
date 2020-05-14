import java.util.Scanner;

public class Solution8741 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		for(int testcase = 1;testcase <= T;testcase++) {
			String s = sc.nextLine();
			String[] arr = s.split(" ",-1);
			s = "";
			for(int i = 0;i < arr.length;i++) {
				s += arr[i].toUpperCase().charAt(0);
			}
			System.out.println("#"+testcase+" "+s);
		}
	}
}
