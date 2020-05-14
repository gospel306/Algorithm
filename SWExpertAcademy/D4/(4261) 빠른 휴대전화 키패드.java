import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for (int t = 1; t <= testcase; t++) {
			String S = sc.next();
			int N = sc.nextInt();
			int count = 0;
			for (int j = 0; j < N; j++) {
				String word = sc.next();
				if(word.length() == S.length()) {
					int checkc = 0;
					for (int i = 0; i < S.length(); i++) {
						char c = S.charAt(i);
						char w = word.charAt(i);
						switch (c) {
						case '2':
							if(w=='a'||w=='b'||w=='c')
								checkc++;
							break;
						case '3':
							if(w=='d'||w=='e'||w=='f')
								checkc++;
							break;
						case '4':
							if(w=='g'||w=='h'||w=='i')
								checkc++;
							break;
						case '5':
							if(w=='j'||w=='k'||w=='l')
								checkc++;
							break;
						case '6':
							if(w=='m'||w=='n'||w=='o')
								checkc++;
							break;
						case '7':
							if(w=='p'||w=='q'||w=='r'||w=='s')
								checkc++;
							break;
						case '8':
							if(w=='t'||w=='u'||w=='v')
								checkc++;
							break;
						case '9':
							if(w=='w'||w=='x'||w=='y'||w=='z')
								checkc++;
							break;
						}
						if(checkc == word.length())
							count++;
					}
				}
			}
			System.out.println("#"+t+" "+count);
		}
	}
}
