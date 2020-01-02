import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		HashSet<Integer> set = new HashSet<>();
		for(int t = 1;t <= testcase;t++) {
			int[] num = new int[7];
			for(int i = 0;i < 7;i++)
				num[i] = sc.nextInt();
			list.clear();
			set.clear();
			for(int i = 0;i < 7;i++)
				for(int j = i+1;j<7;j++)
					for(int k = j+1;k<7;k++) {
						set.add(num[i]+num[j]+num[k]);
					}
			list.addAll(set);
			Collections.sort(list);
			System.out.println("#"+t+" "+list.get(list.size()-5));
		}
	}
}
