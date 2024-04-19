public class atividade29 {
    public static void main(String[] args) {
        float [] vetor = {7,5,9};
        float media = 0;
        float soma = 0;
        for (float f : vetor) {
            soma += f;
        }
        media= soma/vetor.length;
        System.out.println("A media é: " + media);
    }
}
