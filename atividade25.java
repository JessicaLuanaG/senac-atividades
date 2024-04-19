import java.util.Scanner;

public class atividade25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int id = 1;
        int b = 0;
        int c = 0;
        int d = 0;
        while (id > 0) {
           id=scan.nextInt();
             if(id > 0 ){
            if (id<18){
             b += 1;
            c += id;
            }
            if(id>=18){
            d += id;
        }
         }
        }
        scan.close();
        System.out.println(" a media das pessoas menores de idade é " + c/b + ". A soma das pessoas maiores de idade é de: " + d);
    }
}
