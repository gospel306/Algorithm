import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int testcase = sc.nextInt();
		for (int t = 1; t <= testcase; t++) {
			bw.write(String.format("#%d ", t));
			String word;
			char[][] box = new char[5][15];
			for (int i = 0; i < 5; i++) {
				word = sc.next();
				for (int j = 0; j < word.length(); j++)
					box[i][j] = word.charAt(j);
			}
			word = "";
			for (int i = 0; i < 15; i++) {
				for (int j = 0; j < 5; j++)
					if(box[j][i] != 0)
						bw.write(box[j][i]);
			}
			bw.newLine();
		}
		bw.flush();
		sc.close();
	}
}
