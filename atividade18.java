import java.util.Scanner;

public class atividade18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("escreva de 1 a 7:");
        int a = scan.nextInt();
        scan.close();
        switch (a) {
            case 1:
                System.out.println("Domigo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("erro");
                break;
        }
    }
}
