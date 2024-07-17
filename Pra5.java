import java.util.*;
public class Pra5 {
    public static void main(String[] args) {
        // int i = 10;
        // while (i<=20) {
        //     System.out.println(2*i);
        //     i++;
        // }
        // while (i<=10) {
        //     System.out.println(11*i);
        //      i++;
        // }
        // while (i>=1) {
        //     System.out.println(10*i);
        //      i--;
        // }
        int i,fact = 1;
        int number = 5;
        for (i=1;1<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+ number +" is : "+ fact);
    }
}