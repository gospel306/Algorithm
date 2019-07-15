import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for (int t = 1; t <= testcase; t++) {
			int size = sc.nextInt();
			int charsize = sc.nextInt();
			int check = 1, result = 0;
			int[][] puzzle = new int[size][size];
			for (int i = 0; i < puzzle.length; i++)
				for (int j = 0; j < puzzle[i].length; j++)
					puzzle[i][j] = sc.nextInt();

			for (int i = 0; i < puzzle.length; i++) {
				for (int j = 0; j < puzzle[i].length - 1; j++) {
					if (puzzle[i][j] == 1 && puzzle[i][j + 1] == 1)
						check++;
					else if(puzzle[i][j] == 1 && puzzle[i][j+1] == 0) {
						if(check == charsize)
							result++;
						check = 1;
					}
				}
				if(check == charsize)
					result++;
				check = 1;
			}
			check = 1;
			for (int i = 0; i < puzzle.length; i++) {
				for (int j = 0; j < puzzle[i].length - 1; j++) {
					if (puzzle[j][i] == 1 && puzzle[j + 1][i] == 1)
						check++;
					else if(puzzle[j][i] == 1 && puzzle[j+1][i] == 0) {
						if(check == charsize)
							result++;
						check = 1;
					}
				}
				if(check == charsize)
					result++;
				check = 1;
			}
			System.out.println("#"+t+" "+result);
		}
	}
}
