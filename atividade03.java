import java.util.Scanner;

public class atividade03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        System.out.println("escreva um numero:");
        a = scan.nextInt();
        scan.close();
        if (a >= 0){
            System.out.println(a);
        }
        else {
            a = a* -1;
            System.out.println(a);
        }

    }
}
