import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		String nA = "";
		String nB = "";
		while(A>0) {
			nA += A%10;
			A /= 10;
		}
		while(B>0) {
			nB += B%10;
			B /= 10;
		}
		if(Integer.parseInt(nA)> Integer.parseInt(nB))
			System.out.println(nA);
		else
			System.out.println(nB);
	}
}
