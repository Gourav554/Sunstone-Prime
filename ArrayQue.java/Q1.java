import java.util.*;
public class Q31 {
    public static void main(String[] args) {
        int arr[]= {8,31,-21,4,33};

        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                System.out.println(arr[i]);
            }
        }
        //  System.out.println(arr[i+1]);
    }
    
}
