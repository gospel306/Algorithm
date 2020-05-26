import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.next();
		int sum = 0;	
		for(int i = 0;i < line.length();i++) {
			sum+=2;
			int c = line.charAt(i) - 'A';
			if(c> 21)
				sum+=7;
			else if(c>18)
				sum+=6;
			else if(c > 14)
				sum+=5;
			else if(c > 11)
				sum+=4;
			else if(c >8)
				sum+=3;
			else if(c > 5)
				sum+=2;
			else if(c > 2)
				sum+=1;
		}
		System.out.println(sum+line.length());
	}
}
