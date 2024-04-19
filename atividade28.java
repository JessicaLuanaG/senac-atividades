public class atividade28 {
    public static void main(String[] args) {
        int [] vetor = {1,1,1,1,1,-19,1,19,1,1};
        int maior = 0;
        int menor = Integer.MIN_VALUE ;
        for (int i : vetor) {
            if (i>maior){
                maior=i;
            }
            if (i<menor){
                menor = i;
            }    
        }
        System.out.println(maior + " e " + menor);
    }
    
}
