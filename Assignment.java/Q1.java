import java.util.*;
public class Q1 {
    public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		   int odd =0;
		   int even = 0;
		   int digit ;
		   int position =1;
		   for( ; 0<n;n = n/10){
			    digit = n% 10;

			   if(position %2 == 0){
				   even = even +digit;
			   }
			   else{
				   odd = odd +digit;
			   }
              position ++;
		   }
		  
		   System.out.println(+odd);
		    System.out.println(+even);
} }