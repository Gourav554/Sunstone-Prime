public class Exception_Handling {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;  // error
        } catch (Exception e) {
            System.out.println("Error handled");
        }
    }
    
}


// Exception Handling programming ka ek important concept hai jo runtime 
// errors (exceptions) ko handle karne ke liye use hota hai, taaki program crash
//  na ho aur smoothly chale.