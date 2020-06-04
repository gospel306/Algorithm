public int solution(int n, int[] lost, int[] reserve) {
		int[] check = new int[n];
		for(int i = 0;i < lost.length;i++)
			check[lost[i]-1]--;
		for(int i = 0;i < reserve.length;i++)
			check[reserve[i]-1]++;
		for(int i = 0;i < check.length;i++) {
			if(check[i] == 2 && i > 0 && check[i-1] < 1) {
				check[i]--;
				check[i-1]++;
			}else if(check[i] == 2 && i < check.length-1 && check[i+1] < 1) {
				check[i]--;
				check[i+1]++;
			}
		}
		int count = 0;
		for(int i = 0;i < check.length;i++)
			if(check[i] > 0)
				count++;	
		return count;
	}
