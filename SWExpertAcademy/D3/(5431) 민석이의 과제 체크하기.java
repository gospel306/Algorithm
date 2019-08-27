import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = Integer.parseInt(sc.nextLine());
		int n = 0;
		while(n < testcase) {
			int students = sc.nextInt();
			int submit = sc.nextInt();
			int[] student = new int[students];
			int num;
			for(int i = 0;i < submit;i++) {
				num = sc.nextInt();
				student[num-1] = 1;
			}
			n++;
			System.out.printf("#%d ",n);
			for(int i = 0;i < student.length;i++) {
				if(student[i] == 0)
					System.out.printf("%d ",i+1);
			}
			System.out.println();
		}
	}
}
