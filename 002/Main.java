import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int t = input.nextInt();

        int[] h = new int[n];
        
        for(int i = 0; i < n; i++) {
            h[i] = input.nextInt();
        }

        int cnt = 0;
        for(int mask = 0; mask < (1<<n); mask++){
            int totalHeight = 0;
            for (int i = 0; i < n; i++) {
                if (((mask >> i) & 1 ) == 1) {
                    totalHeight += h[i];
                }
            }
            if(totalHeight == t && mask != 0){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}