import java.util.Scanner;

public class Solution8049 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int testcase = 1;testcase <= T;testcase++) {
			String line = sc.next();
			if(line.matches("^((FF+MCM+)*(FC+MF)*)+$"))
				System.out.println("#"+testcase+" DETECTED!");
			else
				System.out.println("#"+testcase+" NOTHING!");
		}
	}
}
