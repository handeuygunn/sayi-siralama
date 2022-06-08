import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;

        Scanner girdi = new Scanner(System.in);

        System.out.println("1.sayiyi giriniz:");
        a = girdi.nextInt();
        System.out.println("2.sayiyi giriniz:");
        b = girdi.nextInt();
        System.out.println("3.sayiyi giriniz:");
        c = girdi.nextInt();

        if (a >b && b>c ){
            System.out.println( "a>b>c");
        }
        if (a >c && c>b ){
            System.out.println( "a>c>b");
        }
        if (b >a && a>c ){
            System.out.println( "b>a>c");
        }
        if (b >c && c>a ){
            System.out.println( "b<c>a");
        }
        if (c >b && b>a ){
            System.out.println( "c>b>a");
        }
        if (c >a && a>b ){
            System.out.println( "c>a>b");
        }
    }
}
