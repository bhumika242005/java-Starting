import java.util.*;
public class doublevalue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Result = 1;
        System.out.println("Enter your First number");
        int n1 = sc.nextInt();
        System.out.println("Enter your Second number");
        int n2 = sc.nextInt();
        for (int i = 1;i<=n2;i++){
            Result *= n1;
        }
        System.out.println(Result);
    }
    }
