import java.util.*;
public class KilometerToMile {
    public static void main(String[] args) {
        System.out.println("Enter your distance in kilometer");
        Scanner sc = new Scanner(System.in);
        double kilometers = sc.nextDouble(); 
        double miles = kilometers / 1.6;
        System.out.println(miles + " miles");
    }
}