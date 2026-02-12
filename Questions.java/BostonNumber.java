import java.util.*;

public class BostonNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int original = n;
        int digitSum = 0;
        int temp = n;
         int factorSum = 0;
        while (temp != 0) {
            digitSum += temp % 10;
            temp /= 10;
        }
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                int f = i;

                while (f != 0) {
                    factorSum += f % 10;
                    f /= 10;
                }

                n = n / i;
            }
        }

        // Step 3: Check
        if (digitSum == factorSum)
            System.out.println("Boston Number");
        else
            System.out.println("Not a Boston Number");
    }
}
