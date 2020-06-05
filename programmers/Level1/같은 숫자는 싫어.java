import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> ans = new ArrayList<>();
		int n = arr[0];
		ans.add(n);
		for(int i = 1;i <arr.length;i++)
			if(arr[i] != n) {
				ans.add(arr[i]);
				n = arr[i];
			}
		int[] answer = new int[ans.size()];
		for(int i = 0;i < ans.size();i++)
			answer[i] = ans.get(i);
		return answer;
    }
}
