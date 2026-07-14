import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int ans = 0;

        int n = input.nextInt();
        int x = input.nextInt();

        int[] c = new int[n];
        int[] s = new int[n];

        for (int i = 0; i < n; i++){
            c[i] = input.nextInt();
            s[i] = input.nextInt();
        }

        for (int mask = 0; mask < (1 << n); mask++){
            int totalCost = 0;
            int totalPoint = 0;
            for (int i = 0; i < n; i++){
                if(((mask >> i) & 1) == 1 ){
                    totalCost += c[i];
                    totalPoint += s[i];
                }
            }
            if (totalCost <= x){
                ans = Math.max(ans,totalPoint);
            }
        }


        System.out.println(ans);
        input.close();
    }
}