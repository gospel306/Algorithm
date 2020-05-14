import java.util.Scanner;

public class Solution {
	static int[][] dir = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
	static int[][] arr;
	static int count;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int t = 1;t <= testcase;t++) {
			int R = sc.nextInt();
			int C = sc.nextInt();
			arr = new int[R][C];
			count = 0;
			for(int i = 0;i < R;i++) {
				String word = sc.next();
				for(int j=0;j < C;j++) {
					arr[i][j] = word.charAt(j) - 'A';
				}
			}
			solution(1 << arr[0][0],0,0,1);
			System.out.println("#"+t+" "+count);
		}
	}

	public static void solution(int check,int x,int y,int cnt) {
		if(count == 26)
			return;
		count = (count < cnt) ? cnt : count;
		
		for(int i = 0;i < dir.length;i++) {
			int xa = x + dir[i][0];
			int ya = y + dir[i][1];
			if(xa>=0&&xa<arr.length&&ya>=0&&ya<arr[0].length&&(check&(1 << arr[xa][ya]))==0) {
				solution(check|(1 << arr[xa][ya]),xa,ya,cnt+1);
			}
		}
	}
}
