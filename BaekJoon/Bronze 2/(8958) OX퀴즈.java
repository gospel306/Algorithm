import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0;i < n;i++) {
			String line = sc.next();
			int sum = 0,count = 0;
			for(int j = 0;j < line.length();j++) {
				if(line.charAt(j) == 'O') {
					count++;
					sum += count;
				}else
					count = 0;
			}
			System.out.println(sum);
		}
	}
}
