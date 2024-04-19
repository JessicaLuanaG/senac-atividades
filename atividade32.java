import java.util.Scanner;

public class atividade32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("escreva um nome:");
        String entrada = scan.nextLine();
        String reversa = "";
        for ( int i = entrada.length() -1; i>=0; i--){
            reversa += entrada.charAt(i);
        }
        if (entrada.equals(reversa)){
            System.out.println("é um palindromo");
            scan.close();
            System.exit(0);
        }
        System.out.println("não é um palindromo");
        scan.close();

    }
}
