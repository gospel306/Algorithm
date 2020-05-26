import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.MAX_VALUE;
		int b = Integer.MAX_VALUE;
		for(int i = 0;i < 3;i++)
			a = Math.min(a, sc.nextInt());
		for(int i = 0;i < 2;i++)
			b = Math.min(b, sc.nextInt());
		System.out.println(a+b-50);
	}
}
