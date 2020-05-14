import java.util.Scanner;

public class Solution{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int TC = 1;TC <= testcase;TC++) {
			int N = sc.nextInt();
			int X = sc.nextInt();
			System.out.print("#"+TC+" ");
			if(X == 1 || X == 2*N -1)
				System.out.println("0");
			else
				System.out.println("1");
		}
	}
}
