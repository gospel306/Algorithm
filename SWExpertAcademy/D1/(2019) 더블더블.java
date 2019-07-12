import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i = 0;i < num+1;i++)
			System.out.printf("%d ", (int)Math.pow(2,i));
	}
}
