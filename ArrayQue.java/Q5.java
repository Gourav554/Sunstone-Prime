
import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        Boolean found =false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==31){
                System.out.println("index"+i);
                found=true;
                break;
            } }
            if(found==false){
                System.out.println("Not found");
            }
            
        }
    }
    

