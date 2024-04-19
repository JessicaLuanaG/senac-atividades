public class atividade30 {
    public static void main(String[] args) {
        int [] vetor = {2,3,4,5};
        int [] vetro = new int[4];
        int a;
        for (a=vetor.length - 1; a >= 0;a--){
        vetro[a] = vetor[vetor.length-a - 1];
        }
        for (int i : vetro) {
            System.out.print(i);
        }
        
    }
}
