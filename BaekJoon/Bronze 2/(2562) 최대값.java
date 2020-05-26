import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int check = 0;
		for(int i = 0;i < 9;i++) {
			int s = sc.nextInt();
			if(max < s) {
				max = s;
				check = i+1;
			}
		}
		System.out.println(max);
		System.out.println(check);
	}
}
