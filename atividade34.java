public class atividade34 {
    public static void main(String[] args) {
        int[][] matriz = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] mariz = new int[3][3];
        for ( int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                mariz [j][i] = matriz [i][j];
            }
            }
        for ( int i = 0; i<3; i++){
            for(int j = 0; j<3; j++)
                System.out.print(mariz[i][j]);
                System.out.print("\n");}
        }

    }

