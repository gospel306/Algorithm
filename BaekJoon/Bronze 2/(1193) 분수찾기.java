import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int cnt = 0;
		while(num > 0) {
			cnt++;
			num -= cnt;
		}
		if(cnt % 2 == 0)
			System.out.println((cnt+num)+"/"+(1-num));
		else
			System.out.println((1-num)+"/"+(cnt+num));
	}
}
