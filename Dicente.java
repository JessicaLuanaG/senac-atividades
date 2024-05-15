public class Dicente {
    protected String nome;
    protected double nota1;
    protected double nota2;
    protected double nota3;
    
    public Dicente(String nome, double nota1, double nota2, double nota3){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calcularMedia (){
        return ((nota1 + nota2 + nota3)/3);
    }
    public boolean verificarAprovacao(){
        return(calcularMedia()>=6);
    }
    public void imprimirResultado(){
        System.out.println(verificarAprovacao() + " " + calcularMedia());
    }
}
