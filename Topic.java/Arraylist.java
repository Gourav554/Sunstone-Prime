import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
          int Max = Collections.mmax(list);
        //  int min = Collections.min(list);

       // int Decimal = Collections.binarySearch(list, 50);
        
        System.out.println(list); //Size
        System.out.println(list.remove(4));  //Remove
        System.out.println(list);
        System.out.println(list.get(3));   // elewment dekhna
        list.add(1,5);
        System.out.println(list);  //add element
        list.set(3,9);
        System.out.println(list);    //update element
       
        System.out.println(list.reversed());    //reverse element
       //  Collections.reverse(list.subList(0, 3));

       // Collections.sort(list);       //sorting ke liye
        System.out.println(list);

// Descending
//Collections.sort(list, Collections.reverseOrder());
System.out.println(list); // [8, 5, 2, 1]
        
        
    }
    
}














 