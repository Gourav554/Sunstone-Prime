import java.util.*;

public class Q18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int inverse = 0;
        int position = 1;

        while (n > 0) {

            int digit = n % 10;

        
            inverse = inverse + position * (int)Math.pow(10, digit - 1);

            n = n / 10;
            position++;
        }

        System.out.println(inverse);

        sc.close();
    }
}