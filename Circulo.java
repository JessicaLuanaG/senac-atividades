public class Circulo {
    private double raio;
    private double centroX;
    private double centroY;

    public Circulo(double raio, double centroX, double centroY){
        this.centroX = centroX;
        this.centroY = centroY;
        this.raio = raio;
    }
    
    public double getCentroX(){
    return centroX;        
    }

    public double getCentroY(){
        return centroY;
    }

    public double calcularArea(){
        return Math.PI * Math.pow(raio, 2);
    }

    public double perimetro(){
        return 2 * Math.PI * raio;
    }

    public void imprimir(){
        System.out.println(raio);
        System.out.println(this.perimetro());
        System.out.println(this.calcularArea());
    }


    


}    
