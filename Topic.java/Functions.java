import java.util.*;
public class Functions {
     public static int Gcd (int a,int b){
            while(b!=0){
                int t= a%b;
                a=b;
                b=t;
            }
                return a;
            }
        
    public static void main(String[]args) {
                    Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
             int b = sc.nextInt();
       System.out.println(Gcd(a, b));
        
        
        }
}
    
