import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for (int t = 1; t <= testcase; t++) {
			String line = sc.next();
			boolean[] s = new boolean[14], d = new boolean[14], h = new boolean[14], c = new boolean[14];
            Arrays.fill(s, false);
			Arrays.fill(d, false);
			Arrays.fill(h, false);
			Arrays.fill(c, false);
			boolean check = false;
			int b;
			char a;
			int scount = 0, dcount = 0, hcount = 0, ccount = 0;
			Out: for (int i = 0; i < line.length() / 3; i++) {
				a = line.charAt(3 * i);
				b = Integer.parseInt(line.substring((3 * i) + 1, 3 * i + 3));
				switch (a) {
				case 'S':
					if (s[b] == true) {
						check = true;
						break Out;
					}
					s[b] = true;
					break;
				case 'D':
					if (d[b] == true) {
						check = true;
						break Out;
					}
					d[b] = true;
					break;
				case 'H':
					if (h[b] == true) {
						check = true;
						break Out;
					}
					h[b] = true;
					break;
				case 'C':
					if (c[b] == true) {
						check = true;
						break Out;
					}
					c[b] = true;
					break;
				}
			}
			System.out.printf("#%d ",t);
			if (check == true)
				System.out.println("ERROR");
			else {
				for (int i = 1; i < 14; i++) {
					if (s[i] == false)
						scount++;
					if (d[i] == false)
						dcount++;
					if (h[i] == false)
						hcount++;
					if (c[i] == false)
						ccount++;
				}
				System.out.printf("%d %d %d %d\n", scount, dcount, hcount, ccount);
			}
		}
	}
}
