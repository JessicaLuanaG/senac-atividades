public class atividade48 {
    public static void main(String[] args) {
        Pessoa [] vet = new Pessoa[10];
        for (int i= 0 ; i<10;i++) {
            vet [i] = new Pessoa ("maria", 12,"prof");
            System.out.println(vet[i].getNome());
            
        }
    }
}
