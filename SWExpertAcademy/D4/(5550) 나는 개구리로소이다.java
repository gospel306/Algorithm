import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for (int t = 1; t <= testcase; t++) {
			String line = sc.next();
			int result = 0;
			int tresult = 0;
			int[] frog = new int[5];
			boolean flag = true;
			for (int i = 0; i < line.length(); i++) {
				switch (line.charAt(i)) {
				case 'c':
					if (tresult != 0) {
						result--;
						tresult--;
					}
					result++;
					frog[0]++;
					break;
				case 'r':
					frog[0]--;
					frog[1]++;
					if (frog[0] < 0) {
						flag = false;
						result = -1;
					}
					break;
				case 'o':
					frog[1]--;
					frog[2]++;
					if (frog[1] < 0) {
						flag = false;
						result = -1;
					}
					break;
				case 'a':
					frog[2]--;
					frog[3]++;
					if (frog[2] < 0) {
						flag = false;
						result = -1;
					}
					break;
				case 'k':
					frog[3]--;
					tresult++;
					if (frog[3] < 0) {
						flag = false;
						result = -1;
					}
					break;
				}
				if (flag == false)
					break;
			}
			for (int i = 0; i < 5; i++) {
				if (frog[i] != 0){
					result = -1;
                    break;
                }
			}
			System.out.printf("#%d %d\n",t,result);
		}
	}
}
