import java.util.*;
public class Q2{
    public static void main(String args[]) {
		 Scanner  sc = new Scanner (System.in);
		 int n = sc.nextInt();
		 int D = sc.nextInt();
		 int digit ;
		 int count =0;

		 for( ;n>0 ; n = n/10){
             digit = n%10;
			 if(digit==D){
				 count ++;
			 }
		 }
		 System.out.println(count);

    }
}