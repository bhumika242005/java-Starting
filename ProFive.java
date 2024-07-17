import java.util.*;
public class ProFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number for factorial");
        int i,fact = 1;
        int number = sc.nextInt();
        for (i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is : "+ fact);
    }
}

