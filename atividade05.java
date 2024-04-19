import java.util.Scanner;

public class atividade05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float delta, b, a, c, mais, menos;
        System.out.println("escreva um numero:");
        a = scan.nextFloat();
        System.out.println("escreva outro numero:");
        b = scan.nextFloat();
        System.out.println("escreva outro numero:");
        c = scan.nextFloat();
        scan.close();
        delta = (float) (Math.pow(b,2) - 4*a*c);
        if (delta<0){
            System.out.println("erro");
            System.exit(1);
        }
        mais = (float) ((-b + Math.sqrt( delta))/(a*2));
        menos = (float) ((-b - Math.sqrt(delta))/(a*2));
        System.out.println("As raizes dessa equação são: " + mais + " e " + menos);

    }
}
