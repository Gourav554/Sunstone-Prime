import java.util.*;
import java.util.Collection;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        
        System.out.println(list); //Size
        System.out.println(list.remove(4));  //Remove
        System.out.println(list);
        System.out.println(list.get(3));   // elewment dekhna
        list.add(1,5);
        System.out.println(list);  //add element
        list.set(3,9);
        System.out.println(list);    //update element
       
        System.out.println(list.reversed());    //reverse element
        Collections.sort(list);       //sorting ke liye
        System.out.println(list);

         Collections.sort(list, Collections.reverseOrder()); //reverse sorting ke liye asscending order mai
        System.out.println(list);
          Collections.sort(list); //sorting in ascending order
          System.out.println(list);
    }
    
}




















 