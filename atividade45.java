import java.util.Scanner;

public class atividade45 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Seu nome:");
    String nomep= scan.nextLine();
    System.out.println("Sua idade:");
    int idadep= scan.nextInt();
    System.out.println("Sua profissão:");
    String profisp= scan.next();
    scan.nextLine();  // Consume newline left-over
    Pessoa pessoa1 = new Pessoa (nomep , idadep, profisp);

    System.out.println("titulo livro: ");
    String titulol=scan.nextLine();
    scan.nextLine();  // Consume newline left-over
    System.out.println("autor livro: ");
    String autorl=scan.nextLine();
    System.out.println("n° paginas livro: ");
    int pagl=scan.nextInt();
    System.out.println("ano pub livro: ");
    int anol=scan.nextInt();

    Livro livro1 = new Livro (titulol, pagl, anol, autorl);

    System.out.println("Comprimento retangulo: ");
    float compret= scan.nextFloat();
    System.out.println("Largura retangulo: ");
    float largret= scan.nextFloat();

    Retangulo retangulo1 = new Retangulo(compret, largret);

    System.out.println("Marca carro: ");
    scan.nextLine();
    String marcc= scan.nextLine();
    System.out.println("Modelo carro: ");
    String modelc= scan.nextLine();
    System.out.println("Ano carro: ");
    int anoc = scan.nextInt();
    scan.nextLine();
    System.out.println("Cor carro: ");
    String corc= scan.nextLine();


    Carro carro1 = new Carro(marcc, modelc, anoc, corc);




    System.out.println("Dados da pessoa: " + pessoa1.getNome() + " " + pessoa1.getIdade() + " " + pessoa1.getProfissao() );
    System.out.println("Dados Retangulo: " + retangulo1.area() + " " + retangulo1.perimetro() );
    System.out.println("Dados Livro: " + livro1.getTitulo() + " " + livro1.getAutor() + " " + livro1.getAno() + " " + livro1.getNumero());
    System.out.println("Dados Carro: " + carro1.getMarca() + " " + carro1.getModelo() + " " + carro1.getAno() + " " + carro1.getCor() );
    scan.close();

    
    
    
}
}
