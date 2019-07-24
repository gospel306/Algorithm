import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		String[] code = { "0001101", "0011001", "0010011", "0111101", "0100011", "0110001", "0101111", "0111011",
				"0110111", "0001011" };
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for (int t = 1; t <= testcase; t++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			String b = sc.nextLine();
			String[] line = new String[N];
			int even = 0, odd = 0;
			int checknum = 0, result = 0;
			String check = "";
			for (int i = 0; i < N; i++) {
				line[i] = sc.nextLine();
				if(line[i].contains("1"))
					check = line[i];
			}
			int a = 7;
			for (int i = check.length() - 1; i > 6; i--) {
				if (check.charAt(i) == '1')
					for (int j = 0; j < code.length; j++) {
						if (check.substring(i - 6, i + 1).equals(code[j])) {
							if(a % 2 == 1)
								even += j;
							else
								odd += j;
							a--;
							i -= 6;
							break;
						}
					}
			}
			checknum = odd * 3 + even;
			if (checknum % 10 == 0)
				result = even + odd;
			System.out.println("#"+t+" "+result);
		}
	}
}
