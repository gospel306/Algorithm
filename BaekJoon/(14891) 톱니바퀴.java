import java.util.Scanner;

public class Main {
	static int[][] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		arr = new int[4][8];
		for(int i = 0;i < 4;i++) {
			String s = sc.nextLine();
			for(int j = 0;j < 8;j++)
				arr[i][j] = Integer.parseInt(s.substring(j, j+1));
		}
		int k = sc.nextInt();
		for(int i = 0;i < k;i++) {
			int num = sc.nextInt();
			int direct = sc.nextInt();
			Solution(num, direct);
		}
		int sum = 0;
		for(int j = 0;j < 4;j++)
			if(arr[j][0] == 1)
				sum += Math.pow(2, j);
		System.out.println(sum);
	}
	public static void Solution(int num, int direct) {
		switch(num) {
		case 1:
			if(direct == 1) {
				if(arr[0][2] != arr[1][6]) {
					if(arr[1][2] != arr[2][6]) {
						if(arr[2][2] != arr[3][6])
							movecounterclockwise(3);
						moveclockwise(2);
					}
					movecounterclockwise(1);
				}
				moveclockwise(0);
			}else{
				if(arr[0][2] != arr[1][6]) {
					if(arr[1][2] != arr[2][6]) {
						if(arr[2][2] != arr[3][6])
							moveclockwise(3);
						movecounterclockwise(2);
					}
					moveclockwise(1);
				}
				movecounterclockwise(0);
			}
			break;
		case 2:
			if(direct == 1) {
				if(arr[0][2] != arr[1][6])
						movecounterclockwise(0);
				if(arr[1][2] != arr[2][6]) {
					if(arr[2][2] != arr[3][6])
						moveclockwise(3);
					movecounterclockwise(2);
				}
				moveclockwise(1);
			}else {
				if(arr[0][2] != arr[1][6])
					moveclockwise(0);
				if(arr[1][2] != arr[2][6]) {
					if(arr[2][2] != arr[3][6])
						movecounterclockwise(3);
					moveclockwise(2);
				}
				movecounterclockwise(1);
			}
			break;
		case 3:
			if(direct == 1) {
				if(arr[2][6] != arr[1][2]) {
					if(arr[1][6] != arr[0][2])
						moveclockwise(0);
					movecounterclockwise(1);
				}
				if(arr[2][2] != arr[3][6])
					movecounterclockwise(3);
				moveclockwise(2);
			}else {
				if(arr[2][6] != arr[1][2]) {
					if(arr[1][6] != arr[0][2])
						movecounterclockwise(0);
					moveclockwise(1);
				}
				if(arr[2][2] != arr[3][6])
					moveclockwise(3);
				movecounterclockwise(2);
			}
			break;
		case 4:
			if(direct == 1) {
				if(arr[3][6] != arr[2][2]) {
					if(arr[2][6] != arr[1][2]) {
						if(arr[1][6] != arr[0][2])
							movecounterclockwise(0);
						moveclockwise(1);
					}
					movecounterclockwise(2);
				}
				moveclockwise(3);
			}else {
				if(arr[3][6] != arr[2][2]) {
					if(arr[2][6] != arr[1][2]) {
						if(arr[1][6] != arr[0][2])
							moveclockwise(0);
						movecounterclockwise(1);
					}
					moveclockwise(2);
				}
				movecounterclockwise(3);
			}
			break;
		}
	}
	public static void moveclockwise(int num) {
		int tmp = arr[num][7];
		for(int i = 7;i > 0;i--) {
			arr[num][i] = arr[num][i-1];
		}
		arr[num][0] = tmp;
	}
	public static void movecounterclockwise(int num) {
		int tmp = arr[num][0];
		for(int i = 0;i <7;i++) {
			arr[num][i] = arr[num][i+1];
		}
		arr[num][7] = tmp;
	}
	
}
