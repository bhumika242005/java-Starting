import java.util.*;
public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = sc.nextInt();
        if (number>50){
            System.out.println("It's fifty above");
        }
        else {
            System.out.println("It's below fifty");
        }
    }
}