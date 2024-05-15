package atividade55;

public class Carro implements Veiculo, MeioDeTransporte{
    @Override
    public void mover(){
        System.out.println("Veiculo movendo");
    }

    @Override
    public void parar(){
        System.out.println("Veiculo parado");
    }
    
}
