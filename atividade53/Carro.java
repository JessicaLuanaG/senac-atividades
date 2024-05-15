package atividade53;

public class Carro extends Veiculo{

    public Carro(String marca, String modelo, int ano){
        super(marca, modelo, ano);

    }    

    public boolean eCarro(){
        System.out.println("vroom-vroom");
        return true;
    }
}
