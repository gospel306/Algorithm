import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	static String[] word = {"ZRO","ONE","TWO","THR","FOR","FIV","SIX","SVN","EGT","NIN"};
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcase = Integer.parseInt(br.readLine().trim());
		for(int t = 0;t < testcase;t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String T = st.nextToken();
			int N = Integer.parseInt(st.nextToken());
			int[] number = new int[10];
			st = new StringTokenizer(br.readLine());
			for(int i = 0;i < N;i++) {
				String check = st.nextToken();
				for(int j = 0;j < word.length;j++) {
					if(check.equals(word[j])) {
						number[j]++;
						break;
					}
				}
			}
			System.out.println(T);
			for(int i = 0;i < number.length;i++) {
				for(int j = 0;j < number[i];j++)
					System.out.print(word[i]+" ");
			}
			System.out.println();
		}
	}
}
