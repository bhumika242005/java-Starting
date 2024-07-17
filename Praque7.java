import java.util.*;
public class Praque7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
       int n = sc.nextInt();
       int i = 0, j = 0;
       while (i<n){
        while (j<(n-i)){
           System.out.print("*");
           j++; 
        }
        System.out.print("\n");
        i++;
        j=0;
       }
    }
}