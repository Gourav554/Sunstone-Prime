
import java.util.*;

public class Q12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String n = sc.next();   

        char[] arr = n.toCharArray(); 

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == '0') {
                arr[i] = '5';
            }
        }

       
        String result = new String(arr);

        System.out.println(result);

        sc.close();
    }
}