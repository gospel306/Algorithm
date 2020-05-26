import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0;i < n*2-1;i++) {
			if(i <n)
				for(int j = 0;j <= i;j++)
					System.out.print("*");
			else
				for(int j = n*2-1-i;j > 0;j--)
					System.out.print("*");
			System.out.println();
		}
	}
}
