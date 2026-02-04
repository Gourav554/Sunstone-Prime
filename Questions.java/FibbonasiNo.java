import java.util.*;
public class FibbonasiNo {
    public static int Fibbonasi(int n){
        if(n==0 || n==1){
            return n;}
            else{
        return Fibbonasi(n-1) + Fibbonasi(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<=n;i++){
        System.out.println(Fibbonasi(i));
    }

}
}
