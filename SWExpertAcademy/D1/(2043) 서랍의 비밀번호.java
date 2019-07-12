import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int end = sc.nextInt();
		int start = sc.nextInt();
		int count = 0;
		for(int i = start;i <= end;i++)
			count++;
		System.out.print(count);
	}
}
