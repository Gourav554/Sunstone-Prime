import java.util.*;

public class Q16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N1 = sc.nextInt(); 
        int N2 = sc.nextInt(); 

        int count = 0;

        for (int i = 1; count< N1; i++) {

            int term = 3 * i + 2;

            if (term % N2 != 0) {
                System.out.println(term + " ");
                count++;
            }
        }  
    }
}