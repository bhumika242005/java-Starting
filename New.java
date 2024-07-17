import java.util.Scanner;

class Subject {
    int max = 100;
    int obtd;
}

public class New {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); // Create a single Scanner object

        Subject s1 = new Subject();
        System.out.print("Enter Maths Marks:");
        s1.obtd = scn.nextInt(); // Use the same Scanner object for all inputs

        Subject s2 = new Subject();
        System.out.print("Enter Science Marks:");
        s2.obtd = scn.nextInt();

        Subject s3 = new Subject();
        System.out.print("Enter English Marks:");
        s3.obtd = scn.nextInt();

        Subject s4 = new Subject();
        System.out.print("Enter Social Science Marks:");
        s4.obtd = scn.nextInt();

        Subject s5 = new Subject();
        System.out.print("Enter Hindi Marks:");
        s5.obtd = scn.nextInt();

        int tobtd = s1.obtd + s2.obtd + s3.obtd + s4.obtd + s5.obtd;
        int per = (tobtd * 100) / 500; // Calculate the percentage
        System.out.println("Percentage obtained: " + per + "%");

        scn.close(); // Close the Scanner object to prevent resource leaks
    }
}
