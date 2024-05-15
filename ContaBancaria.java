public class ContaBancaria {
    private String numeroDaConta;
    private String nomeDoTitular;
    private double saldo;

    public ContaBancaria(String numeroDaConta, String nomeDoTitular, double saldo){
        this.nomeDoTitular = nomeDoTitular;
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }

    public void depositar(double valor){
     saldo+= valor;
    }

    public boolean sacar(double valor){
        if (saldo>=valor){
            saldo-=valor;
            return true;
        }
        return false;
    }

    public double getSaldo(){
        return saldo;
    }

    public void imprimir(){
        System.out.println(nomeDoTitular);
        System.out.println(numeroDaConta);
        System.out.println(saldo);
    }

}
