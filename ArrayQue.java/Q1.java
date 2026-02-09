import java.util.*;
public class Q1 {    //MAXIMUM
    public static void main(String[] args) {
        int arr[]= {8,31,-21,48,33};

        int max= Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
            max=arr[i];
        }
        //System.out.println(arr[i+1]);
       }
       System.out.println(max);
    }}