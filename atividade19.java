import java.util.Scanner;

public class atividade19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("digite primeiro numero");
        float a = scan.nextFloat();
        System.out.println("digite segundo numero");
        float b = scan.nextFloat();
            System.out.println("digite 1 para + ,2 para - ,3 para * e 4 para /");
        int c = scan.nextInt();
        float d;
        scan.close();
        switch (c) {
            case (1):
            d = a + b;
            System.out.println(d);
                break;
            case (2):
            d = a - b;
            System.out.println(d);
                break;            
            case (3):
            d = a * b;
            System.out.println(d);
                break;            
            case (4):
            d = a / b;
            System.out.println(d);
                break;
        
            default:
            System.out.println("erro");
            break;
        }

    }    
}
