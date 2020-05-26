import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int suger = sc.nextInt();
		int n = 0;
		while(true) {
			if(suger % 5 == 0) {
				System.out.println(suger/5+n);
				break;
			}else if(suger <= 0) {
				System.out.println("-1");
				break;
			}
			suger -= 3;
			n++;
		}
	}
}
