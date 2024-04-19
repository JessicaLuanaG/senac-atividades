import java.util.Scanner;

public class atividade16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor da compra");
        Float a = scan.nextFloat();
        scan.close();
        if (a>1000){
            a = a- (a * 0.1f) ;
            System.out.println("Seu valor é mais que 1000 reais então você conseguiu um desconto de 10%. Logo seu valor vai ficar: " + a);
            System.exit(1);
        }
        System.out.println("Como seu valor não passou 1000, não tera desconto. A compra ficará: " + a);
    }
}
