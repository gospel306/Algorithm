import java.util.ArrayList;

public class Solution {
	public static void main(String[] args) {
		ArrayList<Boolean> primeList = new ArrayList<>();
		primeList.add(false);
		primeList.add(false);
		for(int i = 2; i <= 1000000;i++)
			primeList.add(true);
		for(int i = 2; (i*i)<=1000000;i++) {
			if(primeList.get(i)) {
				for(int j = i*i;j <= 1000000;j+=i)
					primeList.set(j,false);
			}
		}
		StringBuffer sb = new StringBuffer();
		for(int i = 0;i <= 1000000;i++)
			if(primeList.get(i) == true) {
				sb.append(i);
				sb.append(" ");
			}
		System.out.println(sb.toString());
	}
}
