import java.util.*;
public class Weatherdetecting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your temperature in celsius");
        int temperature = sc.nextInt();
        if (temperature>29) {
            System.out.println("It's summer days!");
        }
        else if (temperature>23) {
            System.out.println("It's rainy days!");
        }
        else if (temperature>8) {
            System.out.println("It's winter days!");
        }
        else {
            System.out.println("Don't go outside! it's extreme cold.
            
            
            
            ");
        }
    }
} 