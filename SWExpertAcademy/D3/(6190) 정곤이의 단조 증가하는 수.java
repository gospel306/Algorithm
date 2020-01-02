import java.util.Scanner;

public class Solution {
    static boolean isMonoIncreasing(int num) {
        int q, r, cur;
        cur = 9;
        for(q=num; q>0; q/=10) {
            r = q % 10;
            if( r > cur ) return false;
            if( r < cur ) cur = r;
        }
        return true;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
 
        int N, i, j, mul, max;
        int[] a;
        for(int test_case = 1; test_case <= T; test_case++) {
            N = sc.nextInt();
            a = new int[N+1];
            max = -1;
            for(i=1; i<=N; i++) {
                a[i] = sc.nextInt();
            }
            for(i=1; i<=N-1; i++) {
                for(j=i+1; j<=N; j++) {
                    mul = a[i] * a[j];
                    if( isMonoIncreasing(mul) && mul > max ) max = mul;
                }
            }
            System.out.format("#%d %d\n",test_case,max);
        }
    }
}
