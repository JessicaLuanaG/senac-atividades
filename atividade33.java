import java.util.Scanner;

public class atividade33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] vetor = {2,3,4,5};
        System.out.println("fale um numero: ");
        int a = scan.nextInt();
        for (int i : vetor) {
            if(i==a){
                System.out.println("tem");
                System.exit(0);
            }
            
        }
        
        System.out.println("perdeu");
        scan.close();

    }
}
