import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] square = new int[N+1];
		square[0] = 1;
		square[1] = 1;
		for(int i = 2;i <= N;i++)
			square[i] = (square[i-1]+square[i-2])%10007;
		System.out.println(square[N]);
	}
}
