import java.util.Scanner;

public class atividade26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira um valor inteiro");
        int a = scan.nextInt();
        scan.close();
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;
        int g = 0;
        int h = 0;
        if (a>200){
        b=a/200;
        a=a%200;
        }
        if (a>100){
        c=a/100;
        a=a%100;
        }
        if (a>50){
        d=a/50;
        a=a%50;
        }
        if (a>20){
        e=a/20;
        a=a%20;
        }
        if (a>10){
        f=a/10;
        a=a%10;
        }
        if (a>5){
        g=a/5;
        a=a%5;
        }
        if (a>2){
        h=a/2;
        a=a%2;
        }
        System.out.println(b + " cedula de 200, " + c + " cedula de 100, " + d + " cedula de 50, " + e + " cedula de 20, " +
        f + " cedula de 10, " + g + " cedula de 5, " + h + " cedula de 2, " + a + " cedula de 1");
    }
}
