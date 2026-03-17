import java.util.*;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int sum = 0;
        int power = 0;

        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem * (int)Math.pow(2, power);
            power++;
            n = n / 10;   // ✅ important
        }

        System.out.println(sum);
    }
}