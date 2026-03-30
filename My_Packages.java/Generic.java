import java.util.ArrayList;
public class Generic {
    public static void main(String[] args) {
        // Generic programming ka concept hai jisme hum data types ke saath 
        // flexible code likh sakte hain. Isme hum type parameters ka use karte hain.
       //<_____> iske bEECH MAI JO BHI LIKHENGE USSI TYPE KA DATA STORE HOGA 
  ArrayList<String> list = new ArrayList<>();
  list.add("Gourav");



  // Another Liklne se hum ek aur list bana sakte hain jisme hum alag type ka data store kar sakte hain,
  ArrayList anotherlist = new ArrayList<>();
  anotherlist.add("Jaiswal");
  anotherlist.add(20);
  anotherlist.add(132.54);

  System.out.println(list);
  System.out.println(anotherlist);
    }
}