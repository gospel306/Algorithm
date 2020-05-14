import java.util.Scanner;

public class Solution8821 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int TC = 1;TC <= testcase;TC++) {
			String str = sc.next();
			boolean[] arr = new boolean[10];
			for(int i = 0;i < str.length();i++)
				if(arr[str.charAt(i) - '0'])
					arr[str.charAt(i) - '0'] = false;
				else
					arr[str.charAt(i) - '0'] = true;
			int count = 0;
			for(int i = 0;i < arr.length;i++)
				if(arr[i] == true)
					count++;
			System.out.println("#"+TC+" "+count);
		}
	}
}
