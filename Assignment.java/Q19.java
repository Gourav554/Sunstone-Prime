import java.util.*;
public class Q19 {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
           for(int i =1;i<=T; i++){
			   int n= sc.nextInt();
		   
	    
        int digit = 0;
		
		int sum =0;
		int even =0;
		int odd =0;
		for(;n>0;n = n/10){
		   digit = n%10;
		   if(digit%2 ==0){
            even = even +digit;
		   }
		   else{
			   odd = odd +digit;
		   }
		}
		 if(even %4 ==0 ||odd %3==0){
			 System.out.println("Yes");
		 }else{
			 System.out.println("No");
		 }
    }
}}