import java.util.Scanner;

public class atividade39 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("escreva algo:");
        String entrada = scan.nextLine();
        int ac = 0;
        for ( int i = entrada.length() -1; i>=0; i--){
            if(entrada.charAt(i)=='a'|| entrada.charAt(i)=='e'|| entrada.charAt(i)=='i' ||entrada.charAt(i)=='o' || entrada.charAt(i)=='u'){
            ac += 1;
        }
    }
        System.out.println(ac);
        scan.close();

    }
}
