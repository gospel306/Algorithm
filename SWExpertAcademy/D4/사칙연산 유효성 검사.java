import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int t = 1; t < 11; t++) {
			int n = Integer.parseInt(sc.nextLine());
			int result = 1;
			for (int i = 0; i < n; i++) {
				String line = sc.nextLine();
				String[] a = line.split(" ");
				switch (a.length) {
				case 2:
					if (isStringNum(a[1]) == false)
						result = 0;
					break;
				case 4:
					if (isStringNum(a[1])) 
						result = 0;
					break;
				}
			}
			System.out.println("#"+t+" "+result);
		}
	}
	public static boolean isStringNum(String s) {
		try {
			Integer.parseInt(s);
			return true;
		}catch(NumberFormatException e) {
			return false;
		}
	}
}
