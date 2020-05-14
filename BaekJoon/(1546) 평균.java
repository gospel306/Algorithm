import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int max = 0;
		double result = 0;
		for(int i = 0;i < N;i++) {
			int a = sc.nextInt();
			result += a;
			if(max < a)
				max = a;
		}
		result=result/max*100.0/N;
		System.out.printf("%f\n",result);		
	}
}
