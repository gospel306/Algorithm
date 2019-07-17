import java.util.Base64;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int t = 1;t <= testcase;t++) {
			String encode = sc.next();
			String decode = new String(Base64.getDecoder().decode(encode));
			System.out.format("#%d %s\n",t,decode);
		}
	}
}
