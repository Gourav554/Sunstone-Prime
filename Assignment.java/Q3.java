import java.util.*;
public class Q3 {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rev =0;
		int digit ;
        // Your Code Here
		for(;n>0;n=n/10){
			digit = n%10;
			rev = rev*10 +digit;
		}
		System.out.println(rev);
    }
}
