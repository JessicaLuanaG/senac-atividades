import java.util.Scanner;

public class atividade17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite sua temperatura:");
        double a = scan.nextDouble();
        scan.close();
        if (a<36.1){
            System.out.println("Você está frio");
        }
        if (a>37.2){
            System.out.println("Você está quente");
        }
        else{
            System.out.println("Você está ameno");
        }
        
    }
}
