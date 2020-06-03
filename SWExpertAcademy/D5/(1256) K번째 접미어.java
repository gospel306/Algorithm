import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcase = Integer.parseInt(br.readLine());
		for (int t = 1; t <= testcase; t++) {
			int n = Integer.parseInt(br.readLine());
			String line = br.readLine();
			String[] a = new String[line.length()];
			for (int i = 0; i < a.length; i++) {
				a[i] = line;
				line = line.substring(1, line.length());
			}
			Arrays.sort(a);
			System.out.printf("#%d %s\n", t, a[n-1]);
		}
	}
}
