import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int t = 1; t < 11; t++) {
			LinkedList<Integer> list = new LinkedList<>();
			int size = sc.nextInt();
			for (int i = 0; i < size; i++)
				list.add(sc.nextInt());
			int a = sc.nextInt();
			for (int i = 0; i < a; i++) {
				String string = sc.next();
				switch(string) {
				case "I":
					int where = sc.nextInt();
					int howmany = sc.nextInt();
					for (int j = 0; j < howmany; j++)
						list.add(where++, sc.nextInt());
					break;
				case "D":
					where = sc.nextInt();
					howmany = sc.nextInt();
					for(int j = 0; j < howmany;j++)
						list.remove(where);
					break;
				case "A":
					howmany = sc.nextInt();
					for(int j = 0; j<howmany;j++)
						list.add(sc.nextInt());
					break;
				}
			}
			System.out.printf("#%d ",t);
			for (int i = 0; i < 10; i++)
				System.out.print(list.get(i) + " ");
			System.out.println();
		}
	}
}
