import java.io.*;
import java.util.*;

public class Solution {

    static int[] countingSort(int[] arr) {
        int n = arr.length;
 
        // The output character array that will have sorted arr
        int output[] = new int[n];
 
        // Create a count array to store count of inidividual
        // characters and initialize count array as 0
        int count[] = new int[100];
        for (int i=0; i<100; ++i)
            count[i] = 0;
 
        // store count of each character
        for (int i=0; i<n; ++i)
            ++count[arr[i]];
 
        // Change count[i] so that count[i] now contains actual
        // position of this character in output array
        for (int i=1; i<=99; ++i)
            count[i] += count[i-1];
 
        return count;
    }

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        String[] data = new String[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            data[arr_i] = in.nextLine();
        }
        int[] result = countingSort(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}