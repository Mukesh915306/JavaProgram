import java.util.*;
public class PrefixSum{
    static void prefix(int[] arr){
        int n = arr.length-1;
        for(int i = 1; i <= n; i++){
            arr[i] = arr[i] +arr[i-1];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        prefix(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
