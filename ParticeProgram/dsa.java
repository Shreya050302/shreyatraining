
import java.util.Scanner;

public class dsa {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int age = scanner.nextInt();
        String adult = (age >= 18) ? "eligible": "not eligible";
        System.out.println(adult);
       System.out.println("My Age is:"+age);  
    }
    
}
