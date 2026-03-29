public class Exception_Handling {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;  // error
        } catch (Exception e) {
            System.out.println("Error handled");
        }
    }
    
}
