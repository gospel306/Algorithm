import java.util.Scanner;

public class Main1011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for(int i = 0;i < T;i++){
            double x = sc.nextInt();
            double y = sc.nextInt();
            double j = 1, cnt = 0;
            for(;;j++)
                if(j*j > y - x)
                    break;
            if(Math.pow(j - 1, 2) == y - x)
                cnt = 2 * (j- 1) - 1;
            else if (Math.pow(j - 1, 2) + ((Math.pow(j, 2) - Math.pow(j - 1, 2)) / 2) >= y - x)
                cnt = 2 * j - 2;
            else
                cnt = 2 * j - 1;
            System.out.println((int)cnt);
        }
    }
}
