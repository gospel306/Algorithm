import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] n = new int[42];
		for(int i = 0;i < 10;i++) {
			int num = sc.nextInt()%42;
			n[num]++;
		}
		int count = 0;
		for(int i = 0;i < 42;i++) {
			if(n[i] != 0)
				count++;
		}
		System.out.println(count);
	}
}
