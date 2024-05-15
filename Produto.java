public class Produto {
    protected String nome;
    protected double preco;
    protected int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque){
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
    

    public int adicionarEstoque(int quantidade){
        return quantidadeEmEstoque += quantidade; 
    }
    public int removerEstoque(int quantidade){
        return quantidadeEmEstoque-= quantidade;
    }
    public boolean verificarDisponibilidade(){
        return (quantidadeEmEstoque>0);
    }
    public double calcularValorTotal(int quantidade){
        return quantidade*preco;
    }
    public void imprimirInformacoes(){
        System.out.println(nome);
        System.out.println(preco);
        System.out.println(quantidadeEmEstoque);
    }

}
