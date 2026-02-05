import java.util.*;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int Sum=0;
        int pow =0;
        int g=0;
        while(n>0){
            int rem =n%10;
            Sum = Sum + rem * (int)Math.pow(2, g);
              g++;
            n=n/10;
        }
        System.out.println(Sum);
    }
    
}
