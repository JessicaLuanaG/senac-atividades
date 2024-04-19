import java.util.Scanner;

public class atividade21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        scan.close();
        int b;
        for ( b = 2; b <= a; b+=2){
            System.out.println (b);
        }
    }
}
