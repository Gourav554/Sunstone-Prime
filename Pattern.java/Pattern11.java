 import java.util.Scanner;
public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=n;i>=1;i--){
            for(int j=1; j<=n-i+1;j++){
               System.out.print("* ");
            }
           for(int j=1;j<=2*i-3;j++){
            System.out.print(" ");
           }
           if(i==1){
            for(int j=1;j<=n-1;j++){
                System.out.print("*");
            }
           }
           else{
            for(int j=1;j<=n-i+1;j++){
                System.out.print("* ");
            }
           }
          System.out.println();
        }
                
       

        }
            }
           
        

       
        
    

