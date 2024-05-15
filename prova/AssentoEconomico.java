package prova;

public class AssentoEconomico implements Assento {
    protected boolean ocupado;




    public AssentoEconomico( boolean ocupado){
        this.ocupado=false;

    }



    @Override
    public void reservar(){
        if (ocupado) {
            System.out.println("O assento ja esta emprestado");
            return;
        }
        ocupado= true;
        System.out.println("A reserva do assento foi bem sucedido, o valor será de 12354,68. "  );
    }

    
}


