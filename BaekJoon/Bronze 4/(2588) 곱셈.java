import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		String n2 = sc.next();
		System.out.println(n1*(n2.charAt(2)-'0'));
		System.out.println(n1*(n2.charAt(1)-'0'));
		System.out.println(n1*(n2.charAt(0)-'0'));
		System.out.println(n1*Integer.parseInt(n2));
	}
}
