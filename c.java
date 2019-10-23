import java.util.Scanner;

public class c{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        float n = scn.nextFloat();
        float max = n;
        float min = n;
        for(int i=1 ; i<10 ; i++){
            n = scn.nextFloat();
            if(max<n){
                max = n;
           }else if (min>n){
                min = n ;
           }
        }
        System.out.println(max);
        System.out.println(min);
    }
}