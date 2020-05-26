import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int avg = 0;
		for(int i = 0;i < 5;i++) {
			int n = sc.nextInt();
			if(n < 40)
				n = 40;
			avg += n;
		}
		System.out.println(avg/5);
	}
}
