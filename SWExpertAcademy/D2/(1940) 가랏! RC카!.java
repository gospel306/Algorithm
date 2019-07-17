import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for (int t = 1; t <= testcase; t++) {
			int command = sc.nextInt();
			int meter = 0;
			int sp = 0;
			int speed;
			for (int i = 0; i < command; i++) {
				int accel = sc.nextInt();
				switch (accel) {
				case 0:
					meter += sp;
					break;
				case 1:
					speed = sc.nextInt();
					sp += speed;
					meter += sp;
					break;
				case 2:
					speed = sc.nextInt();
					if(sp > speed)
						sp -= speed;
					else
						sp = 0;
					meter += sp;
					break;
				}
			}
			System.out.println("#"+t+" "+meter);
		}
	}
}
