New.java
import java.util.Scanner;
public class Main {
class Subject{
    int max = 100;
    int obtd;
}
}
Main.java public class main {
    public static void main(String[] args) {
        Subject s1 = new Subject();
        System.out.print("Enter Maths Marks:");
        Scanner scn = new Scanner(System.in);
        s1.obtd = new Scanner(System.in).nextInt();
        Subject s2 = new Subject();
        System.out.print("Enter Science Marks:");
        s2.obtd = new Scanner(System.in).nextInt();
        Subject s3 = new Subject();
        System.out.print("Enter English Marks:");
        s3.obtd = new Scanner(System.in).nextInt();
        Subject s4 = new Subject();
        System.out.print("Enter Social Science Marks:");
        s4.obtd = new Scanner(System.in).nextInt();
        Subject s5 = new Subject();
        System.out.print("Enter Hindi Marks:");
        s5.obtd = new Scanner(System.in).nextInt();
        int tobtd = (s1.obtd)+(s2.obtd)+(s3.obtd)+(s4.obtd)+(s5.obtd);
        int per = (tobtd*100/500);
        System.out.println("Percentage obtained:"+per+"%"); 
    }
}