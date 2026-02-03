import java.util.Scanner;
public class Sum_Digit{
    public static void main(String[]args)
    {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
       
        int rev=0;
        for(int i=n;i!=0;i/=10)
        {
         int k = n%10;
         rev =rev+k;
          n = n/10;
        }
        System.out.println(rev);
    }
    
}
