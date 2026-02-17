import java.util.*;

public class Q7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a = 0, b = 1;

        // Special cases
        if (n == 0) {
            System.out.println(0);
            return;
        }

        if (n == 1) {
            System.out.println(1);
            return;
        }

        int c = 0;

        for (int i = 2; i <= n; i++) {

            c = a + b;
            a = b;
            b = c;
        }

        System.out.println(c);

        sc.close();
    }
}
