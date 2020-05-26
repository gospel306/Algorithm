import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i = 0;i < num;i++) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			int n = sc.nextInt();
			String s = "";
			if((n-1)/h+1>=10)
				s = ((n-1)%h+1)+""+((n-1)/h+1);
			else
				s = ((n-1)%h+1)+"0"+((n-1)/h+1);
			System.out.println(s);
		}
	}
}
