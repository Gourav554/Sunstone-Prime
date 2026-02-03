import java.util.Scanner;

public class Lotterygame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      if(n>=300&& n<=460){
        System.out.println("MacBook");    //only if lagane se wo sare if check karega 
      }
      else if(n>=200&&n<=280){
        System.out.println("kurke");   //else if lagane se jaha usse answer milega wahi se out
      }
      else if(n>=1100&&n<=1500){
        System.out.println("cycle");
      } else if(n>=50&&n<=80){
        System.out.println("bike");
      }
      else{
        System.out.println("Better luck next time");
      }
        }
    }
    

