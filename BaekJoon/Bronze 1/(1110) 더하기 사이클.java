import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int num = sc.nextInt();
		int tmp = num;
		do{
			num = num%10*10+(num/10 + num%10)%10;
			n++;
		}while(tmp != num);
		System.out.println(n);
	}
}
