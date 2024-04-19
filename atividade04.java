import java.util.Scanner;

public class atividade04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        int hora;
        int min;
        System.out.println("escreva a duração em segundos:");
        a = scan.nextInt();
        scan.close();
        hora = a/3600;
        min = (a%3600)/60;
        a = ((a%3600)%60);
        System.out.println("são " + hora + " horas, " + min + " minutos e " + a + " segundos");
    }
}
