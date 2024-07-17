import java.util.*;
public class Naming {
    public static void main(String[] args) {
        
        System.out.println("Enter your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        switch(name) {
            case "Bhumika":
                System.out.println("hello bhumika");
                break;
                default:
                        System.out.println("hello anybody");
        }System.out.println("Bhumika is always best");
    }
}