import java.util.Scanner;

public class atividade13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       System.out.println("Escreva velocidade maxima permitida:");
       int a = scan.nextInt();
       System.out.println("Escreva velocidade do motorista:"); 
       int b = scan.nextInt();
       scan.close();
       if (a<b){
        System.out.println("A multa sera de " + (b-a)*5 + " reais");
        System.exit(1);
       }
       System.out.println("Não terá multa, motorista dirigindo dentro do permitido");
    }
}
