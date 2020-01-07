import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int t = 0; t < 10; t++) {
			int testcase = sc.nextInt();
			int[][] ladder = new int[100][100];
			int endx = 0, endy = 0;
			boolean check = true;
			for (int i = 0; i < ladder.length; i++)
				for (int j = 0; j < ladder[i].length; j++) {
					ladder[i][j] = sc.nextInt();
					if (ladder[i][j] == 2)
						endx = j;
				}
			endy = ladder.length - 1;
			while (check == true) {
				ladder[endy][endx] = 3;
				if (endx + 1 < ladder.length && ladder[endy][endx + 1] == 1) {
					endx++;
				}else if(endx - 1 >= 0 && ladder[endy][endx - 1] == 1) {
					endx--;
				}
				else if (endy - 1 >= 0 && ladder[endy - 1][endx] == 1) {
					endy = endy - 1;
				}
				else {
					check = false;
				}
			}
			System.out.println("#"+testcase+" "+endx);
		}
	}	
}
