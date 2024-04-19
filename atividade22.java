import java.util.Scanner;

public class atividade22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float a;
        int b = 0;
        float c = 0;
        do{
            System.out.println("digite nota");
            a = scan.nextFloat();
            if (a>0){
            c= c + a;
            b = b + 1;}
        }while (a>0);
        scan.close();
        float d = c/b;
        System.out.println("A media é: " + d);

    }
    
}
