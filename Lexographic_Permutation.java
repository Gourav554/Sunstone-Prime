import java.util.Arrays;

public class Lexographic_Permutation {
    public static void main(String[] args) {

        String str = "ABC";
        char arr[] = str.toCharArray();
        
        Arrays.sort(arr);

        do {
            System.out.println(arr);
        } while(nextPermutation(arr));
    }

    static boolean nextPermutation(char arr[]) {
        int i = arr.length - 2;

        while(i >= 0 && arr[i] >= arr[i+1])
            i--;

        if(i < 0)
            return false;

        int j = arr.length - 1;

        while(arr[j] <= arr[i])
            j--;

        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        Arrays.sort(arr, i+1, arr.length);
        return true;
    }
}