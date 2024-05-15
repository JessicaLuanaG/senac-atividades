import java.util.Scanner;

public class atividade50 {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
        ContaBancaria contita = new ContaBancaria("22395","maria", 0);
        do {
      
        System.out.println("Escolha oque você quer fazer : ");
        System.out.println("D para Depositar");
        System.out.println("S para Sacar");
        System.out.println("V para Ver seu Saldo");
        System.out.println("I para informações");
        System.out.println("X para sair");
        char a = scan.next().charAt(0);

        switch (a) {
            case 'D':
            System.out.println("Qual valor que deseja depositar?");
            double d = scan.nextDouble();
            contita.depositar(d);
                break;

            case 'S':
            System.out.println("Quanto deseja sacar?");
            double s = scan.nextDouble();
            if (!contita.sacar(s)) {
                System.out.println("Imposivel de sacar, saldo insuficiente.");                
            }


            break;

            case 'V':
            System.out.println(contita.getSaldo());

            break;
            
            case 'I':
            contita.imprimir();

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
