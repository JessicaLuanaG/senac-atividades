import java.util.Scanner;

public class atividade31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("escreva um nome:");
        String entrada = scan.nextLine();
        String reversa = "";
        for ( int i = entrada.length() -1; i>=0; i--){
            reversa += entrada.charAt(i);
        }
        System.out.println(reversa);
        scan.close();

    }
}
