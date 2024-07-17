import java.util.*;
public class Sumofeven {
    public static void main(String[] args){
        int sum=0;
        int n=4;
        for(int i=0;i<n;i++){
            sum = sum + (2*i);
        }
        System.out.println("sum of first n numbers = "+ sum);
    }
}