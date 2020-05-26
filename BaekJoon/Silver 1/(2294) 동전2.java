import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j;
		int n = sc.nextInt(),k = sc.nextInt();
		int a[] = new int [n+1],b[] = new int[k+1];
		
		
		for(i=1;i<=k;i++)
			b[i] = 100001;
        b[0] = 0;
		for(i=1;i<=n;i++)
			a[i]=sc.nextInt();
		for(i=1;i<=n;i++)
			for(j=a[i];j<=k;j++)
				b[j] = Math.min(b[j], b[j-a[i]]+1);
		if(b[k]==100001)
			b[k] = -1;
		System.out.println(b[k]);;
		sc.close();
	}
}
