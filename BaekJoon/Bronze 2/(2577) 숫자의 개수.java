import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt()*sc.nextInt()*sc.nextInt();
		int[] arr = new int[10];
		while(num>0) {
			int s = num%10;
			arr[s]++;
			num /= 10;
		}
		for(int i = 0;i < arr.length;i++)
			System.out.println(arr[i]);
	}
}
