import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Solution {
	static class lot{
		String hit;
		int price;
		public lot(String hit,int price) {
			this.hit = hit;
			this.price = price;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for (int t = 1; t <= testcase; t++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			ArrayList<lot> lottery = new ArrayList<>();
			for(int i = 0;i <N;i++) {
				String hit = sc.next();
				int price = sc.nextInt();
				lottery.add(new lot(hit,price));
			}
			Collections.sort(lottery, new Comparator<lot>() {
				@Override
				public int compare(lot o1, lot o2) {
					return o1.price < o2.price ? 1:-1;
				}
			});
			int money = 0;
			for(int i = 0;i < M;i++) {
				String lots = sc.next();
				for(int j = 0;j < N;j++) {
					boolean check = true;
					for(int k = 0;k < lottery.get(j).hit.length();k++) {
						if(lottery.get(j).hit.charAt(k) == '*')
							continue;
						else if(lots.charAt(k) != lottery.get(j).hit.charAt(k)) {
							check = false;
							break;
						}
					}
					if(check) {
						money += lottery.get(j).price;
						break;
					}
				}
			}
			System.out.println("#"+t+" "+money);
		}
	}
}
