public class Livro {
    private String titulo;
    private int numero;
    private int ano;
    private String autor;

    public Livro( String titulo, int numero, int ano, String autor ){
        this.titulo = titulo;
        this.numero = numero;
        this.ano = ano;
        this.autor = autor;

    }

    public String getTitulo(){
        return titulo;
    }
    public int getNumero(){
        return numero;
    } 
    public int getAno(){
        return ano;
    }
    public String getAutor(){
        return autor;
}
}
