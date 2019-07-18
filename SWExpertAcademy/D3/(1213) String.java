import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i < 10;i++) {
			int t = sc.nextInt();
			String c = sc.next();
			String line = sc.next();
			int n = 0;
			for(int j = 0;j <line.length() - c.length()+1;j++) {
				if(line.substring(j, c.length() + j).equals(c))
					n++;
			}
			System.out.printf("#%d %d\n",t,n);
		}
	}
}
