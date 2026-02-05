public class Q31 {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {

            // Spaces (for alignment)
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }

            // Print number first
            System.out.print(i + " ");

            // Print zeros
            for (int j = 1; j < i; j++) {
                System.out.print("0 ");
            }

          
            

            System.out.println();
        }
    }
}
