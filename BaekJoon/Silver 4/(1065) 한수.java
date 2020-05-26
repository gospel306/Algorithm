import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(solution(n));
	}
	static int solution(int n) {
		int cnt = 0,h = 0,t = 0,o = 0;
		if(n < 100)
			return n;
		else {
			for(int i = 100;i <= n;i++) {
				h = i/100;
				t = (i%100)/10;
				o = (i%100)%10;
				if(h-t == t-o)
					cnt++;
			}
			return 99+cnt;
		}
	}
}
