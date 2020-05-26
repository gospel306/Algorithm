import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.next();
		line=line.toUpperCase();
		int[] arr = new int[26];
		for(int i = 0;i < line.length();i++) {
			arr[line.charAt(i)-'A']++;
		}
		int cnt = 0, check = 0;
		int count = 0;
		for(int i = 0;i < arr.length;i++) {
			if(cnt < arr[i]) {
				cnt = arr[i];
				count = 1;
				check = i;
			}else if(cnt == arr[i]) {
				count++;
			}
		}
		if(count > 1)
			System.out.println("?");
		else
			System.out.println((char)(check+'A'));
	}
}
