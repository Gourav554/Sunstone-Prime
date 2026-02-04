import java.util.*;
public class DicemalToBinary{
    public static int DTB(int n){
        int rev =0;
        while(n!=0){
            int k = n%10;
            rev = rev*10+k;
            n=n/10;
        }return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int bn=0;
        while(n>0){
            int rem =n%2;
            bn =bn*10 +rem;
            n = n/2;
        }
        System.out.println(DTB(bn));
            
        }
       
    }
    

