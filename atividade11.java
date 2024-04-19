import java.util.Scanner;

public class atividade11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite 1º nota:");
        float nota1 = scan.nextFloat();
        System.out.println("Digite 2º nota:");
        float nota2 = scan.nextFloat();
        System.out.println("Digite 3º nota:");
        float nota3 = scan.nextFloat();
        scan.close();
        float media = (nota1 + nota2 + nota3) / 3.0f;
        if (media >= 6){
            System.out.println("Aprovado. Media = " + media);
            System.exit(1);
        }
        else{
            System.out.println("Reprovado. Media = " + media);
        }
    }
}
