import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();

        int[] arr = new int[K];
        for (int i = 0; i < K; i++) {
            arr[i] = sc.nextInt();
        }

        long left = 1;
        long right = Arrays.stream(arr).max().getAsInt();
        long mid = 0;
        
        while (left <= right) {
            mid = left + (right - left) / 2;
            
            long cnt = 0;
            for (int i = 0; i < arr.length; i++) {
                cnt += arr[i] / mid;
            }
            if (cnt < N) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        System.out.println(right);
        sc.close();
    }
}
