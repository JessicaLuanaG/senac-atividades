package atividade53;
public class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;
    
    public Veiculo(String marca, String modelo, int ano){
        this.ano = ano;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public int getAno(){
        return ano;
    }

    public void Imprimir(){
        System.out.println("A marca é: " + marca);
        System.out.println("O modelo é: " + modelo);
        System.out.println("O ano é: " + ano);
    }
}
