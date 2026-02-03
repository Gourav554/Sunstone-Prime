 import java.util.Scanner;
public class Pattern18  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
          int m=1;
        for(int i=1;i<=n;i++){
          for(int j=1;j<=n-i;j++){
            System.out.print(" ");
          }
          for(int k=1;k<=i;k++){
          
             System.out.print( m+"" );
             m++;
          }
          for(int k=i-1;k>=1;k--){
          
             System.out.print( m+"" );
             m++;
          }
            System.out.println();


        }    
        
    }}