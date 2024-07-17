import java.util.*;
public class ProjectA {
    public static void main(String[] args) {
        System.out.println("enter your marks");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        if (marks>90) {
            System.out.println("Congratulations!you have outstanding performance");
        }
        else if (marks>80) {
           System.out.println("Congratulations!you have excellent performance"); 
        } 
        else if (marks>70) {
            System.out.println("Congratulations!you have very good performance");
        }
        else if (marks>60) {
            System.out.println("Congratulations!you have good performance");
        } 
        else if (marks>50) {
            System.out.println("Congratulations!you have average performance");
        }
        else if (marks>40) {
            System.out.println("Congratulations!you have pass but do more study for good grades");
        }
        else if (marks>30) {
            System.out.println("Sorry! You are Fail");
        }
        System.out.println("A single piece of paper cannot decide your future");
    }
}    