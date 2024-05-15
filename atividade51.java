import java.util.Scanner;

public class atividade51 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("digite nome do produto");
        String n = scan.nextLine();
        System.out.println("escreva preço");
        double p = scan.nextDouble();
        System.out.println("Escreva quantidade em estoque");
        int q = scan.nextInt();
        System.out.println("Qual a garantia?");
        int g = scan.nextInt();
        System.out.println("Qual a marca?");
        String m = scan.nextLine();

        Eletronico produto1 = new Eletronico(n, p, q, g, m);
        do{
        System.out.println("Escolha oque você quer fazer : ");
        System.out.println("A para Adicionar no Estoque");
        System.out.println("R para Remover do Estoque");
        System.out.println("V para Verificar Disponibilidade");
        System.out.println("I para informações");
        System.out.println("C para Calcular Valor Total");
        System.out.println("E para Estender Garantia");
        System.out.println("X para sair");
        char a = scan.next().charAt(0);

        switch (a) {
            case 'A':
            System.out.println("Qual valor deseja adicionar?");
            int d = scan.nextInt();
            produto1.adicionarEstoque(d);
                break;

            case 'R':
            System.out.println("Quanto deseja remover?");
            int s = scan.nextInt();
            produto1.removerEstoque(s);

            break;

            case 'V':
            System.out.println(produto1.verificarDisponibilidade());

            break;
            
            case 'I':
            produto1.imprimirInformacoes();

            break;

            case 'C':
            System.out.println("com base em quantos produtos?");
            int pr = scan.nextInt();
            System.out.println( produto1.calcularValorTotal(pr));

            break;

            case 'E':
            System.out.println("em quantos meses deseja estender?");
            int e = scan.nextInt();
            produto1.extenderGarantia(e);

            break;

            case 'X':
            System.exit(0);

        scan.close();
            break;

            default :
            System.out.println("erro, não é possivel");

                break;
        }

        } while (true);
    }
}
