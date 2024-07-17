import java.util.*;
public class praque6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int i = 1;
        int fact = 1;
        int number = sc.nextInt();
        while (i<=number){
            fact=fact*i;
            System.out.println("factorial of "+number+" is : "+fact);
        i++;
        }
    }
}