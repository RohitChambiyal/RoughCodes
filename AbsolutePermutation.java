import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static swap(int arr[],int left,int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right]= arr[left];
    }
    static boolean permute(int arr[],int left,int right){
        if(left==right){
            
            int diff = Math.abs(arr[1]-1);
            int i=2;
            while(i<arr.length){
                if(Math.abs(arr[i]-i)!=diff)
                    return false;
                else
                    i++
            }
            return true;
        }
        else{
            int diff;
            for(int i=left;i<=right;i++){
                swap(arr,left,i);
                permute(arr,left+1,right);
                swap(arr,left,i);
            }
        }

    }
    // Complete the absolutePermutation function below.
    static int[] absolutePermutation(int n, int k) {
    int arr[] = new int[n+1];
    for(int i=1;i<=n;i++){
        arr[i] = i;
    }
    permute(arr,1,n
    )

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);

            int[] result = absolutePermutation(n, k);

            for (int i = 0; i < result.length; i++) {
                bufferedWriter.write(String.valueOf(result[i]));

                if (i != result.length - 1) {
                    bufferedWriter.write(" ");
                }
            }

            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
