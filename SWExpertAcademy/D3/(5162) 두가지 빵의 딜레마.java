import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int t = 1;t<=testcase;t++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			int result = 0,remain;
			if(A>B) {
				remain = C%B;
				if(remain >= A) {
					result = C/B + remain/A;
				}else
					result = C/B;
			}else {
				remain = C%A;
				if(remain >= B) {
					result = C/A + remain/B;
				}else
					result = C/A;
			}
			System.out.println("#"+t+" "+result);
		}
	}
}
