import java.util.Scanner;

public class atividade06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int  r, a, n, an; 
        System.out.println("escreva um numero inicial:");
        a =  scan.nextInt();
        System.out.println("escreva uma razao:");
        r = scan.nextInt();
        System.out.println("escreva o n:");
        n = scan.nextInt();
        an = a + (n-1)*r;
        System.out.println("O n-esimo elemento é " + an );
        scan.close();
    }
}