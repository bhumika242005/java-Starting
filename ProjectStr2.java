import java.util.*;
public class ProjectStr2 {
    public static void main(String[] args) {
        String name = "Bhumika";
        // boolean chec = name.startsWith("Bhu");
        // System.out.println(chec);
        // boolean chec = name.endsWith("mika");
        // System.out .println(chec);
        // char ch = name.charAt(2);
        // System.out.println(ch);
        // int index = name.indexOf('m');
        // System.out.println("indexOf('m'):"+ index );
        int index = name.indexOf("m",3);
        System.out.println(  index);
    }
}