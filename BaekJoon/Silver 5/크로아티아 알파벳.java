import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.next();
		int count = 0;
		for(int i = 0;i < line.length();i++) {
			char c = line.charAt(i);
			if(c == 'c') {
				if(i+1 < line.length() && (line.charAt(i+1) == '=' || line.charAt(i+1) == '-'))
					i++;
			}
			else if(c == 'd') {
				if(i+1 < line.length()) 
					if(line.charAt(i+1) == '-')
						i++;
					else if(i+2 < line.length() && line.charAt(i+1) == 'z' && line.charAt(i+2) == '=')
						i += 2;
			}else if(c == 'l') {
				if(i+1 < line.length() && line.charAt(i+1) == 'j')
					i++;
			}else if(c == 'n') {
				if(i+1 < line.length() && line.charAt(i+1) == 'j')
					i++;
			}else if(c == 's') {
				if(i+1 < line.length() && line.charAt(i+1) == '=')
					i++;
			}else if(c == 'z') {
				if(i+1 < line.length() && line.charAt(i+1) == '=')
					i++;
			}
			count++;
		}
		System.out.println(count);
	}
}
