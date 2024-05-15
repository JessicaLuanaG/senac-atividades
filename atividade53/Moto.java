package atividade53;

public class Moto extends Veiculo{
    public Moto(String marca, String modelo, int ano){
        super(marca, modelo, ano);

    }    

    public boolean eMoto(){
        System.out.println("vom-vom");
        return true;
    }
    
}
