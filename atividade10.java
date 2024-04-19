import java.util.Scanner;

public class atividade10 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int b = scan.nextInt();
    scan.close();
    if (b>= 2){
        int a = b * 2;
        int c = b * 3;
        int d = b * 4;
        int e = b * 5;
        System.out.println("numero vezes 2 = " + a + " ,numero vezes 3 = "+ c + " ,numero vezes 4 = "+ d + " ,numero vezes 5 = "+ e);
        System.exit(1);
         }
    System.out.println("erro");

    }
}
