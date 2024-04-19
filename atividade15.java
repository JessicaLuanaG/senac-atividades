import java.util.Scanner;

public class atividade15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        scan.close();
        if (a>0){
            System.out.println("numero positivo");
        }
        if (a==0){
        System.out.println("É zero");
        }
        if (a<0)  {
            System.out.println("É numero negativo");
        }
    }
}

