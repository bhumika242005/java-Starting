import java.util.*;
public class Age {
    public static void main(String[] args) {
        int age ;
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        switch(age) {
            case 18:
                System.out.println("You are going to be adult!");
                break;
            case 23:
                System.out.println("You are going to join a job!");
                break;
            case 60:
                System.out.println("You are going to get retired!");
                break;
                default:
                System.out.println("Enjoy your life!");
        }System.out.println("Thankyou for this code");
    }
}