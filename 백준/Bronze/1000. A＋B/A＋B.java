import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] abc = br.readLine().split(" ");
        int A = Integer.parseInt(abc[0]);
        int B = Integer.parseInt(abc[1]);
        System.out.println(String.valueOf(A+B));
    }
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}
