import java.util.Scanner;

public class atividade49 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("titulo livro: ");
    String titulol=scan.nextLine();
    scan.nextLine();  // Consume newline left-over
    System.out.println("autor livro: ");
    String autorl=scan.nextLine();
    System.out.println("n° paginas livro: ");
    int pagl=scan.nextInt();
    System.out.println("ano pub livro: ");
    int anol=scan.nextInt();
    System.out.println("Digita a velocidade de leitura(pagina por minuto)");
    float pm = scan.nextInt();
    float c = 0;
    int h = 0;
    int m = 0;
    int s = 0;

    Livro livro1 = new Livro (titulol, pagl, anol, autorl);
    
    c = livro1.getNumero() / pm;
    h = (int) c / 60 ;
    m = ((int) c % 60) / 60;
    s = ((int) c % 60) % 60;
    


    System.out.println("horas: " + h + " ,minutos: " + m + " ,segundos: " + s);
    scan.close();

    
}
}
