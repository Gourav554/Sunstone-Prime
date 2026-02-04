import java.util.*;
public class  Fibbo_Pattern {
    public static int Fibbonasi(int G){
        if(G==0 || G==1){
            return G;}
            else{
        return Fibbonasi(G-1) + Fibbonasi(G-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int G=0;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(Fibbonasi(G)+" ");
                G++;
            }
            System.out.println();
        }
        
    }

    
}