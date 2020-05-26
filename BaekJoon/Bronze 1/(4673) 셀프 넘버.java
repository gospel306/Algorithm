public class Main {
	public static void main(String[] args) {
		boolean[] arr = new boolean[10001];
		
		for(int i = 1;i < 10001;i++) {
			int idx = solution(i);
			if(idx < 10001) {
				arr[idx] = true;
			}
		}
		for(int i = 1;i < 10001;i++)
			if(!arr[i])
				System.out.println(i);
	}
	public static int solution(int n) {
		int sum = n;
		while(true) {
			if(n==0)
				break;
			sum+=n%10;
			n = n/10;
		}
		return sum;
	}
}
