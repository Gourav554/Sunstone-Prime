import java.util.*;
public class Strings {
    public static void main(String[] args) {
      //  String name = "hello";
         String fullname ="hello bro";
         Scanner sc =new Scanner(System.in);
         String name = sc.next();      // Single word input ke liye without line
      //  String name = sc.nextLine();      puri line print karwani ho tho with line 
          System.out.println(name); 
          System.out.println(name.length());

          for (int i=0;i<name.length();i++){
            System.out.print(name.charAt(i));
          }
        }
      }
