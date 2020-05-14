import java.io.*;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int num;
         
        num = Integer.parseInt(in.readLine());
        System.out.println(num);
        if(num < 0)
            System.out.println("minus");
    }
 
}
