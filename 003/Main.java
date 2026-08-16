import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int k = scanner.nextInt();

        int count = 0;
        for (int dice1 = 1; dice1 <= a; dice1++) {
            for (int dice2 = 1; dice2 <= b; dice2++) {
                if (dice1 + dice2 == k) {
                    count++;
                }
            }
        }
        System.out.println(count);
        scanner.close();
    }
}