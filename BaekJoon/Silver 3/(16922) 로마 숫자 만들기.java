import java.util.HashSet;
import java.util.Scanner;

public class Main {
	static int[] letter = {1,5,10,50};
	static int N;
	static HashSet<Integer> set;
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		N = sc.nextInt();
		set = new HashSet<>();
		solution(0,0,0);
		System.out.println(set.size());
	}
	static void solution(int a,int depth,int word) {
		if(depth == N) {
			set.add(word);
			return;
		}
		for(int i = a;i < letter.length;i++) {
			word += letter[i];
			solution(i,depth+1,word);
			word -= letter[i];
		}
		
	}
}
