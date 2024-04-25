import java.util.Scanner;

public class atividade43 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int ac = 0;
    for (int i = 1 ; i < a; i++) {
        if(a%i == 0){
            ac += i;
        }
    }
    if(ac == a){
        System.out.println("É um numero perfeito");
        System.exit(1);
    }
    System.out.println("não é");
    scan.close();
}
}
