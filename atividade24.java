import java.util.Scanner;

public class atividade24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        scan.close();
        int b = 1;
        while (a > 1) {
        b *= a ;
        a-=1;

        }
    System.out.println(b);
    }
}
