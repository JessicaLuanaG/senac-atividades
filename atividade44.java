import java.util.Scanner;

public class atividade44 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        char b = scan.next().charAt(0);
        char c = scan.next().charAt(0);
        a = a.replace(b,c);
        System.out.println(a);
        scan.close();
    }
}
