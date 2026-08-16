import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int q = scanner.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        
        int[] s = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            s[i] = s[i - 1] + a[i - 1];
        }

        for (int i = 0; i < q; i++) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();

            int sum = s[r] - s[l -1];
            System.out.println(sum);
        }
    }
}