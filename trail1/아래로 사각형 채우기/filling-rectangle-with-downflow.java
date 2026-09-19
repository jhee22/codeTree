// import 
import java.io.*; 
import java.util.*; 

public class Main {
    public static void main(String[] args) throws Exception{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][n]; 
        int num = 1; 

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = num; 
                System.out.print(arr[i][j] + " "); 
                num += n; 
            }
            num = 2; 
            num += i; 
            System.out.println(); 
        } 
    }
}