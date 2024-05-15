package atividade57;

public class Revista implements Material {
    protected String nome;
    protected boolean emprestado;

    public Revista(String nome){
        this.nome = nome;
        this.emprestado = false;
    }

    @Override
    public void emprestar(){
        if (emprestado) {
            System.out.println("A revista ja esta emprestado");
            return;
        }
        emprestado= true;
        System.out.println("A revista emprestimo bem sucedido");
    }

    @Override
    public void devolver(){
        if (!emprestado) {
            System.out.println("A revista ja esta devolvido");
            return;
        }
        emprestado= false;
        System.out.println("A revista devolução realizada com sucesso");
    }

    @Override
    public boolean estaDisponivel(){
        return !emprestado;
    }
    
    @Override
    public String getNome(){
        return nome;
    }


    
}
