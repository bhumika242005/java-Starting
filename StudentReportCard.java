import java.util.Scanner;

public class StudentReportCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("what is your name?");
        String name = sc.next();
        System.out.println("What is your class?");
        String cls = sc.next();
        System.out.println("what is your roll no.");
        int rollNo = sc.nextInt();
        System.out.println("what is your s1 marks");
        float m1 = sc.nextFloat();
        System.out.println("what is your s2 marks");
        float m2 =sc.nextFloat();
        System.out.println("what is your s3 marks");
        float m3 =sc.nextFloat();
        float answer = ((m1+m2+m3)/300)*100;
        System.out.println("Hi " + name +" Your class is "+ cls + " ur roll no is " + rollNo +" ur percentage is "+answer);
    } 
}