import java.util.*;
public class Solution{
	final static int no = 9999999;
    public static void main(String...msg){
        Scanner sc = new Scanner(System.in);
        int TestCase = sc.nextInt();
        for(int T = 1; T<=TestCase ; T++){
            ArrayList<Integer> use = new ArrayList<Integer>();
            for(int i = 0 ; i < 10; i++){
                if(sc.nextInt() == 1)
                    use.add(i);
            }      
            int num = sc.nextInt();
            int dp[] = new int[num+1];
             
            setDP(num,use,dp);
            if(dp[num]==no)
                System.out.println("#"+T+" -1");
            else
            System.out.println("#"+T+" "+dp[num]);
        }
    }
    static void setDP(int n,ArrayList<Integer> use,int dp[]){
        int len = 0;
        for(int i = n ; i >= 1; i/=10){
            if(use.contains(i%10)){
                len++;
            }else{
                len = no;
                break;
            }
        }    
        if(len != no){
            len++;
            dp[n] = len;
            return;
        }     
        for(int i = 2 ; i < n ; i++){
            if(n % i == 0){
                if(dp[ n / i]==0)
                    setDP(n/i,use,dp);
                if(dp[i] == 0)
                    setDP(i,use,dp);
                 
                if(dp[i]+dp[n/i] < len)
                    len = dp[i]+dp[n/i];
            }
        }
        dp[n] = len;
    }
}
