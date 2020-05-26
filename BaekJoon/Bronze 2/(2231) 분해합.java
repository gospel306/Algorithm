import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = n;
		int count = 0;
		int min = Integer.MAX_VALUE;
		while(m>0) {
			m /= 10;
			count++;
		}
		for(int i = n-count*9;i<=n;i++) {
			int sum = i;
			String s = Integer.toString(i);
			for(int j = 0;j < s.length();j++) 
				sum += s.charAt(j)-'0';
			if(sum == n) {
				min = i;
				break;
			}
		}
		if(min == Integer.MAX_VALUE)
			min = 0;
		System.out.println(min);
	}
}
