package atividade57;

public class Livro implements Material {
    protected String nome;
    protected boolean emprestado;

    public Livro(String nome){
        this.nome = nome;
        this.emprestado = false;
    }

    @Override
    public void emprestar(){
        if (emprestado) {
            System.out.println("O livro ja esta emprestado");
            return;
        }
        emprestado= true;
        System.out.println("O livro emprestimo bem sucedido");
    }

    @Override
    public void devolver(){
        if (!emprestado) {
            System.out.println("O livro ja esta devolvido");
            return;
        }
        emprestado= false;
        System.out.println("O livro devolução realizada com sucesso");
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
