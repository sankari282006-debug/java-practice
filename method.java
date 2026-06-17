import java.util.Scanner;

public class method {

    static boolean check(int a){
        if(a>10 && a<100){
            return true;
        }
        else
        return false;
         }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("pls enter the value of a");
        int a = scanner.nextInt();
      boolean value= check(a);
        System.out.println(value);
    }
}
