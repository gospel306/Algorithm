import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.next();
		for(int i = 0;i < line.length();i++) {
			System.out.print(line.charAt(i));
			if(i%10 == 9)
				System.out.println();
		}
	}
}
