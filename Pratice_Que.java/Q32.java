public class Q32 {
    public static void main(String[] args) {
    int n = 5;

        // Upper Part
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                if (j == 1) {
                    System.out.print(i);
                } else {
                    System.out.print(" * " + i);
                }
            }

            System.out.println();
        }

        // Lower Part
        for (int i = n - 1; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {

                if (j == 1) {
                    System.out.print(i);
                } else {
                    System.out.print(" * " + i);
                }
            }

            System.out.println();
        }
    }
}