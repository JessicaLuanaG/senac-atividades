
public class atividade37 {
    public static void main(String[] args) {
        int [] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 1, 15, 16, 17, 18, 19, 20};
        for (int i = 0; i < vetor.length; i++) {
            for (int j = i+1; j < vetor.length; j++) {
                if(vetor[i]==vetor[j]){
                    vetor[j] = 0;
                    break;
                }
            }
        }
        for (int m : vetor) {
            System.out.println(m);
        }

    }
    
}
