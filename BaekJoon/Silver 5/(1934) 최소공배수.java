import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int t = 0;t < testcase;t++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int lcm = 0;
			if(a >= b) {
				lcm = lcm(a,b);
			}else {
				lcm = lcm(b,a);
			}
			System.out.println(lcm);
		}
	}
	static int gcd(int a,int b) {
		return a%b == 0 ? b : gcd(b,a%b);
	}
	static int lcm(int a,int b) {
		return a*b/gcd(a,b);
	}
}
