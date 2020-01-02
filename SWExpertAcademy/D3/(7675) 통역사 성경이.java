import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for(int tc=1; tc<=t; tc++) {
      int n = sc.nextInt();
      sc.nextLine();
      
      String[] sentence = new String[n];
      sentence = sc.nextLine().split("\\.|\\?|!");
      System.out.print("#"+tc+" ");
      for(int i=0; i<sentence.length; i++) {
        int count = 0;
        String[] word = sentence[i].trim().split(" ");
        for(int j=0;j<word.length;j++) {
        	if(word[j].charAt(0) >= 'A' && word[j].charAt(0) <= 'Z') {
        		count++;
        		for(int k = 1;k < word[j].length();k++)
        			if(word[j].charAt(k) < 'a' || word[j].charAt(k) > 'z') {
        				count--;
        				break;
        			}
        	}
        }
        System.out.print(count+" ");
      }
      System.out.println();
    }
  }
}
