import java.util.Scanner;

public class atividade14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        int a = n/100;
        int b = (n%100)/10;
        int c = (n%100)%10;
        System.out.println(c + "" + b + "" + a);
    }
}
