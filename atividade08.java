import java.util.Scanner;

public class atividade08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inteiro = scan.nextInt();
        Float real = scan.nextFloat();
        double realDoble = scan.nextDouble();
        char c = scan.next().charAt(0);
        String string = scan.next();
        scan.close();
        System.out.println("int = " + inteiro + ", float =" + real + " ,double = " + realDoble + ",char = " + c + " ,string = " + string);
    
    }
}
