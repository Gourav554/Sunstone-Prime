import java.util.*;
public class Q3 {
    public static void main(String[]args){
        int arr[]= {5,2,8,9,65};
        int Min =Integer.MAX_VALUE;
     for(int i=0;i<arr.length;i++){
        if(arr[i]<Min){
            Min=arr[i];
             System.out.println(Min);
        }
     }
    }
    
}
