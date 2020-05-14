import java.io.*;
import java.util.StringTokenizer;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int height = Integer.parseInt(st.nextToken());
        int weight = Integer.parseInt(st.nextToken());
         
        int obesity = weight + 100 - height;
         
        System.out.println(obesity);
        if(obesity > 0)
            System.out.println("Obesity");
    }
 
}
