public class Eletronico extends Produto{
    private int garantia;
    private String marca;

    public Eletronico(String nome, double preco, int quantidadeEmEstoque, int garantia, String marca){
        super(nome,preco,quantidadeEmEstoque);
        this.garantia = garantia;
        this.marca = marca;
    }
    public void extenderGarantia(int meses){
     garantia += meses;
    }
    public void imprimirInformacoes(){
        System.out.println(nome + " " + preco + " " + quantidadeEmEstoque + " " + garantia + " " + marca );
    }
}
