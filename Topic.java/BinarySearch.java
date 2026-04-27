public static void main String args[] {
    int arr[] = {5,8,9,6,4};
    int target = 9;
    int result = binarySearch(arr, target);
    if(result == -1){
        System.out.println("Element not found in the array.");
    } else {
        System.out.println("Element found at index: " + result);
    }
}