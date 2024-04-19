import java.util.Scanner;

public class atividade02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();
        float media = (a + b + c)/ 3.0f;
        System.out.println(media);
    }
}
