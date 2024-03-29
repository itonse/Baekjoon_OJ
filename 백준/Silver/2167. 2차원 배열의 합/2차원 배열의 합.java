import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int arr[][] = new int[N][M];

        for (int a = 0; a < N; a++) {
            for (int b = 0; b < M; b++) {
                arr[a][b] = sc.nextInt();
            }
        }

        int K = sc.nextInt();
        int sum = 0;
        for (int a = 0; a < K; a++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            sum = 0;
            for (int b = i - 1; b < x; b++) {
                for (int c = j - 1; c < y; c++) {
                    sum += arr[b][c];
                }
            }

            System.out.println(sum);
        }
        sc.close();
    }
}