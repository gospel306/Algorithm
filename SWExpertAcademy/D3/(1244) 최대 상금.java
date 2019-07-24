import java.io.*;
import java.util.Scanner;
 
public class Solution {
    public static int ans = 0;
    public static void swap(char str[], int a, int b) {
        char tmp = str[a];
        str[a] = str[b];
        str[b] = tmp;
    }
    public static void backtrack(int left, char str[], int n, int k) {
        if (k == n) {
            int tmp = 0;
            for(int i=0;i<str.length-1;i++)
            {
                tmp+=str[i]-'0';
                tmp*=10;    
            }
            tmp+=str[str.length-1]-'0';
            ans=Math.max(ans, tmp);
            return;
        }
        if (left == str.length - 2) {
            swap(str, left, left + 1);
            backtrack(left, str, n, k + 1);
            return;
        }
        char find = str[left];
        for (int i = left + 1; i < str.length; i++) {
            if (find < str[i]) {
                find = str[i];
            }
        }
        if (str[left] == find)
        {
            backtrack(left + 1, str, n, k);
        } else
        {
            for (int i = left + 1; i < str.length; i++) {
                if (find == str[i]) {
                    swap(str, left, i);
                    backtrack(left + 1, str, n, k + 1);
                    swap(str, left, i);
                }
            }
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int test_case = 1; test_case <= t; test_case++) {
            ans = in.nextInt();
            char[] str = Integer.toString(ans).toCharArray();
            int cnt = in.nextInt();
            backtrack(0, str, cnt, 0);
            System.out.println("#" + test_case + " " + ans);
        }
    }
}
