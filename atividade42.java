import java.util.Scanner;

public class atividade42 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        for ( int i=2; i<= Math.sqrt(a); i++) {
            if (a%i == 0){
                System.err.println("Não É primo");
                System.exit(1);
            }

        }
            System.out.println("é primo");
            scan.close();
    }
}
