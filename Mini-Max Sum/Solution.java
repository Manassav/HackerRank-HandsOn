import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Arrays;
import java.util.stream.*;
import java.util.*; 

public class Solution {
    
    
    
    // Complete the miniMaxSum function below.
    static void miniMaxSum(long[] arr) {
        List<Long> list=Arrays.stream(arr).boxed().collect(Collectors.toList());
        Collections.sort(list); 
        List<Long> min = list.subList(0,list.size()-1);
        long minSum = min.stream().mapToLong(Long::longValue).sum();
        
        
        List<Long> max = list.subList(1,list.size());
        long maxSum = max.stream().mapToLong(Long::longValue).sum();
        System.out.println(minSum+" "+maxSum);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        long[] arr = new long[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            long arrItem = Long.parseLong(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
