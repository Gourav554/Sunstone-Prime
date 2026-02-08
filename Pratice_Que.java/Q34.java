import java.util.Scanner;

public class Q34 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, i, j;

        i = 1;
        n = sc.nextInt();

        while (i <= n) {

            j = 1;
            int mid = (n / 2) + 1;

            while (j <= n) {

                if (i == 1 || j == 1 || i == n || j == n) {
                    System.out.print(" *");
                } 
                else if (i == mid && j == mid) {
                    System.out.print(" @");
                } 
                else {
                    System.out.print(" #");
                }

                j++;
            }

            System.out.println(); // new line
            i++;
        }

        sc.close();
    }
}
