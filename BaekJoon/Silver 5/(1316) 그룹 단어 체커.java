import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = 0;
		for(int i = 0;i < n;i++) {
			boolean[] word = new boolean[26];
			String s = sc.next();
			char a = s.charAt(0);
			boolean check = false;
			for(int j = 1;j < s.length();j++) {
				if(a != s.charAt(j)) {
					if(!word[s.charAt(j)-'a']) {
						word[a-'a'] = true;
						a = s.charAt(j);
					}
					else {
						check = true;
						break;
					}
				}
			}
			if(!check) {
				if(s.charAt(s.length()-1) != a && word[s.charAt(s.length()-1)-'a']) {
					
				}else
					answer++;	
			}
		}
		System.out.println(answer);
	}
}
