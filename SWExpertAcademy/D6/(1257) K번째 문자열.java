import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcase = Integer.parseInt(br.readLine());
		for (int t = 1; t <= testcase; t++) {
			TreeSet<String> string = new TreeSet<>();
			int n = Integer.parseInt(br.readLine());
			String line = br.readLine();	
			for (int i = 0; i < line.length(); i++)
				for(int j = i;j <= line.length();j++) 
					string.add(line.substring(i, j));
			List list = new ArrayList(string);
			System.out.printf("#%d ",t);
			if(n > list.size()-1)
				System.out.printf("none\n");
			else
				System.out.printf("%s\n",list.get(n));
		}
	}
}
