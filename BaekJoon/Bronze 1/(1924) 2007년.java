import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] month = {31,28,31,30,31,30,31,31,30,31,30,31};
		String[] week = {"MON","TUE","WED","THU","FRI","SAT","SUN"};
		int M = sc.nextInt() - 1;
		int D = sc.nextInt() - 1;
		int result = 0;
		for(int i = 0;i < M;i++) {
			result += month[i];
		}
		result += D;
		System.out.println(week[result%7]);
	}
}
