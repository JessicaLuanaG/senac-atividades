import java.util.Scanner;

public class atividade23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int b = 0;
        int a;
        do {
            System.out.println("digite um numero: ");
            a = scan.nextInt();    
            if (a>b){
            b=a;
            }

        }while ( a != 0);
        scan.close();
        System.out.println(b);
    }
}
