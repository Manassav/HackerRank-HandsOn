import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Arrays; 

public class Solution {

    // Complete the divisibleSumPairs function below.
    //1 1 2 2 3 6 
    //3
    //
    
    static int divisibleSumPairs(int n, int k, int[] ar) {
     
     /*Arrays.sort(ar);
     int counts = 0;
     for(int i=0;i<ar.length;i++){
         int compareWith = ar[i];//1
         for(int j=i+1;j<ar.length;j++){
            
             if(compareWith < ar[j] && ((compareWith+ar[j])%k)==0){
             counts++;
             
          }
         }
     }
return counts;*/

int m = 0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if((ar[i]+ar[j])%k==0){
                    m++;
                }
            }
        }
        return m;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = divisibleSumPairs(n, k, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
