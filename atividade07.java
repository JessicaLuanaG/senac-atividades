import java.util.Scanner;

public class atividade07 {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int  r, a, n, an; 
            System.out.println("escreva um numero inicial:");
            a =  scan.nextInt();
            System.out.println("escreva uma razao:");
            r = scan.nextInt();
            System.out.println("escreva o n:");
            n = scan.nextInt();
            an = (int) (float) (a * (Math.pow(r,n-1)));
            System.out.println("O n-esimo elemento é " + an );
            scan.close();
    }
}

