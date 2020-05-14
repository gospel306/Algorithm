import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int t = 1;t <= testcase;t++) {
			String binary = sc.next();
			String triple = sc.next();
			int result = 0;
			char[] bin = binary.toCharArray();
			char[] tri = triple.toCharArray();
			out:
			for(int i = 0;i < binary.length();i++) {
				for(int j = 0;j < triple.length();j++) {
					for(int k = 0;k < 2;k++) {
						bin[i] = Character.forDigit(k, 10);
						for(int w = 0;w < 3;w++) {
							tri[j] = Character.forDigit(w, 10);
							if(Integer.parseInt(String.valueOf(bin),2) == Integer.parseInt(String.valueOf(tri),3)) {
								result = Integer.parseInt(String.valueOf(bin),2);
								break out;
							}
						}
						tri[j] = triple.charAt(j);
					}
					bin[i] = binary.charAt(i);
				}
			}
			System.out.println("#"+t+" "+result);
		}
	}
}
