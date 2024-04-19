import java.util.Scanner;

public class atividade09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("informe um lado(ou raio):");
        float a = scan.nextFloat();
        scan.close();
        float quadrado = a*a;
        float pent = ((float) (((a * Math.sqrt(3)))/2)*(5*a))/2;
        float cir = (float) ((float) Math.PI * Math.pow(a,2));
        System.out.println("quadrado = " + quadrado + ", pentagono = " + pent + " ,circulo = " + cir);
    }
}
