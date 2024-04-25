import java.util.Scanner;

public class atividade38 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [][] matriz =new int [3][3] ;
        for (int i = 0; i<3;i++){
            for (int j = 0; j<3;j++){
                matriz [i][j] = scan.nextInt();
            }
        }
        int ac = 0;
        for ( int k = 0; k<3; k++){
            for(int j = 0; j<3; j++)
            ac += matriz[k][j];

        }
        System.out.println(ac);
        scan.close();
       
    }
}

