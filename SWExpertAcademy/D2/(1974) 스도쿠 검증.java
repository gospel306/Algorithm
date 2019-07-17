import java.util.Scanner;

public class Solution {
	static int[][] sudoku;
	static int result;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int t = 1;t <= testcase;t++) {
			result = 1;
			sudoku = new int[9][9];
			for(int i = 0;i < 9;i++) 
				for(int j = 0;j < 9;j++) 
					sudoku[i][j] = sc.nextInt();
			checkrow();
			if(result != 0)
				checkcolumn();
			if(result != 0)
				checkbox();
			System.out.println("#"+t+" "+result);
		}
	}
	public static void checkrow() {
		for(int i = 0;i < 9;i++) {
			boolean[] check = new boolean[9];
			for(int j = 0;j < 9;j++) {
				if(check[sudoku[i][j]-1]) {
					result = 0;
					return;
				}else {
					check[sudoku[i][j]-1] = true;
				}
			}
		}
	}
	public static void checkcolumn() {
		for(int j = 0;j < 9;j++) {
			boolean[] check = new boolean[9];
			for(int i = 0;i < 9;i++) {
				if(check[sudoku[i][j]-1]) {
					result = 0;
					return;
				}else {
					check[sudoku[i][j]-1] = true;
				}
			}
		}
	}
	public static void checkbox() {
		for(int i = 0;i < 9;i+=3) {
			for(int j = 0;j < 9;j+=3) {
				boolean[] check = new boolean[9];
				for(int k = i;k < i+3;k++) {
					for(int l = j;l < j+3;l++) {
						if(check[sudoku[k][l]-1]) {
							result = 0;
							return;
						}else {
							check[sudoku[k][l]-1] = true;
						}
					}
				}
			}
		}
	}
}
