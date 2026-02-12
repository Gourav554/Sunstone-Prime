import java.util.*;
public class Armstrong_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int originalNum = n;
        int sum = 0;
        for(int i=0;i<=n;i++){
            int digit =n%10;
            sum += digit*digit*digit ;
            n =n/10;
            // System.out.println(sum);
        } System.out.println(sum);

        if(originalNum==sum){
            System.out.println("Armstrong No.");
        }  else {
            System.out.println("Not a Armstrong No.");
        }

        
    }
}






































