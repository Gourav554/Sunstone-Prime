public class Q33 {
    public static void main(String[] args) {
        int n=10;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("  ");
            }
            for(int k=n-i;k<n;k++){
                System.out.print(k + " ");
            }
            System.out.print("0 ");
            for(int l=n-1;l>=n-i;l--){
                System.out.print(l + " ");
            }
            System.out.println();
            }     
}
}
