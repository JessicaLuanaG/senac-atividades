package prova;

public class Assento1Classe implements Assento {
    protected boolean ocupado;




    public Assento1Classe( boolean ocupado){
        this.ocupado=false;

    }

    @Override
    public void reservar(){
        if (ocupado) {
            System.out.println("O assento ja esta emprestado");
            return;
        }
        ocupado= true;
        System.out.println("A reserva do assento foi bem sucedido, o valor sera de 30234,98");
    }

    
}
