import java.util.Scanner;

public class atividade36 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [][] matriz =new int [3][3] ;
        for (int i = 0; i<3;i++){
            for (int j = 0; j<3;j++){
                matriz [i][j] = scan.nextInt();
            }
        }
        for ( int k = 0; k<3; k++){
            for(int j = 0; j<3; j++)
                System.out.print(matriz[k][j]);
                System.out.print("\n");}
                 scan.close();
        }
       
    }
    

