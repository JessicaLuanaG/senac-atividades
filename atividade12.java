import java.util.Scanner;

public class atividade12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escreva o codigo do item desejado: ");
        int a = scan.nextInt();
        System.out.println("Escreva a quantidade desejada: ");
        int q = scan.nextInt();
        scan.close();
        float v;
        switch (a) {
            case (100):
                v = q * 1.10f;
                System.out.println("Voce escolheu 'cachorro quente' em " + q + " quantidade, o valor a ser pago sera de: " + v);

                break;

            case (101):
                v = q * 1.30f;
                System.out.println("Voce escolheu 'Bauru Simples' em " + q + " quantidade, o valor a ser pago sera de: " + v);
                
             break;

             case (102):
             v = q * 1.50f;
             System.out.println("Voce escolheu 'Bauru c/ ovo' em " + q + " quantidade, o valor a ser pago sera de: " + v);
             
             break;
     
             case (103):
             v = q * 1.10f;
             System.out.println("Voce escolheu 'Hamburguer' em " + q + " quantidade, o valor a ser pago sera de: " + v);
             
             break;

             case (104):
             v = q * 1.30f;
             System.out.println("Voce escolheu 'Cheeseburguer' em " + q + " quantidade, o valor a ser pago sera de: " + v);
             
             break;
             
             case (105):
             v = q * 1.0f;
             System.out.println("Voce escolheu 'Refrigerante' em " + q + " quantidade, o valor a ser pago sera de: " + v);
             
             break;
        
             case (106):
             v = q * 2.0f;
             System.out.println("Voce escolheu 'Suco' em " + q + " quantidade, o valor a ser pago sera de: " + v);
             
             break;
        
            default:
            System.out.println("O seu pedido não está no cardapio, sinto muito.");
                break;
        }

    }
}
