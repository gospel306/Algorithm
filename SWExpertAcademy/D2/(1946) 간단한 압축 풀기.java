import java.util.Scanner;

public class Solution{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for (int t = 1; t <= testcase; t++) {
			int size = sc.nextInt();
			String[] letter = new String[size];
			int[] num = new int[size];
			for (int i = 0; i < size; i++) {
				letter[i] = sc.next();
				num[i] = sc.nextInt();
			}
			int count = 0;
			System.out.println("#"+t);
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < num[i]; j++) {
					System.out.print(letter[i]);
					count++;
					if(count == 10) {
						System.out.println();
						count = 0;
					}
				}
			}
			System.out.println();
		}
	}
}
