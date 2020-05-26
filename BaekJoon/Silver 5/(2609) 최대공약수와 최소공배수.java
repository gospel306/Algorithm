import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int gcd = 0;
		int lcm = 0;
		if(N>=M) {
			gcd = gcd(N,M);
			lcm = lcm(N,M);
		}
		else {
			gcd = gcd(M,N);
			lcm = lcm(M,N);
		}
		System.out.println(gcd+" "+lcm);
	}
	static int gcd(int a,int b) {
		return (a % b == 0 ? b : gcd(b,a%b));
	}
	static int lcm(int a,int b) {
		return a*b/gcd(a,b);
	}
}
