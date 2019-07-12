import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		int second = sc.nextInt();
		if(first > second || (first == 1 && second == 3))
			System.out.print("A");
		else if(second > first || (second == 1 && first == 3))
			System.out.print("B");
	}
}
