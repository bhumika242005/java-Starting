import java.util.*;
public class Threedim {
    public static void main(String[] args) {
        int n = 4;
        int i = 0, j = 0,k=0;
        while (i<n){
            while(j<(n-i)){
                while (k<(n-i-j)){
                System.out.print("*");
                k++;
            }
            System.out.print("\n");
                j++;
                k = 0;
        }
        System.out.print("\n");
                i++;j++;
                j = 0;k = 0;
        }
    }
}