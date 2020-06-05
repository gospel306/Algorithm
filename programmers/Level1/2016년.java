class Solution {
    public String solution(int a, int b) {
        int[] month = {0,31,29,31,30,31,30,31,31,30,31,30,31};
		String[] day = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
		String answer = "";
		int d = 0;
		for(int i = 0;i < a;i++)
			d += month[i];
		d += b;
		answer = day[d%7];
		return answer;
    }
}
