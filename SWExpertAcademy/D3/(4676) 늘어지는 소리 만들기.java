import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for (int t = 1; t <= testcase; t++) {
			String string = sc.next();
			int hinum = sc.nextInt();
			int[] direct = new int[hinum];
			for (int i = 0; i < direct.length; i++)
				direct[i] = sc.nextInt();
			String result = "";
			for(int i = 0;i < direct.length;i++) {
				if(direct[i] == 0)
					result += "-";
			}
			for (int i = 0; i < string.length(); i++) {
				result += string.charAt(i);
				for (int j = 0; j < direct.length; j++)
					if (i + 1 == direct[j])
						result += "-";
			}
			System.out.println("#"+t+" "+result);
		}
	}
}
