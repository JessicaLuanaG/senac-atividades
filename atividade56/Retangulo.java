package atividade56;

public class Retangulo implements Figura{
    private float largura;
    private float altura;

    public Retangulo(float largura, float altura){
        this.altura = altura;
        this.largura = largura;
    }

    public float getAltura(){
        return altura;
    }

    public float getLargura(){
        return largura;
    }

    @Override
    public float area(){
        return altura *largura; 
    }

    @Override
    public float perimetro(){
        return (altura * 2) + (largura * 2);
    }

}
