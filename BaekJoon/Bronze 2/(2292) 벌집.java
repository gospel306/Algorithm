import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int n = 0;
		int s = 1;
		while(true) {
			if((6*n)+1 >= N && (6*(n-s))+1 <= N)
				break;
			n+=s;
			s++;
		}
		System.out.println(s);
	}
}
