
// code ko Modify karne ke liye String builder ka use hota hai Add,delete and changes
import java.util.*;
public class Strings_Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("jaiswal");
        System.out.println(sb);
        //char  at Index position
        System.out.println(sb.charAt(0));

        // Change and set char At index position
       sb.setCharAt(2,'p');
       System.out.println(sb);

       // Insert char 
       sb.insert(1,'k');
       System.out.println(sb);

       //Delete char
       sb.delete(0,1);    //end-1 pe khatam hoga
       System.out.println(sb);
        System.out.println(sb.length());
       //

       //Reverse ke liye
        String reversed = new StringBuilder(sb).reverse().toString();
        System.out.println(reversed);
    }
    
}
