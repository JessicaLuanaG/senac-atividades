import java.util.Scanner;

public class atividade46 {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);   

    System.out.println("Comprimento retangulo: ");
    float compret1= scan.nextFloat();
    System.out.println("Largura retangulo: ");
    float largret1= scan.nextFloat();

    Retangulo retangulo1 = new Retangulo(compret1, largret1);
  

    System.out.println("Comprimento retangulo: ");
    float compret2= scan.nextFloat();
    System.out.println("Largura retangulo: ");
    float largret2= scan.nextFloat();

    Retangulo retangulo2 = new Retangulo(compret2, largret2);

    if(retangulo1.area() > retangulo2.area()){
        System.out.println(" O retangulo 1 é maior. Com area de: " + retangulo1.area());
        System.exit(0);
    }
    if(retangulo2.area() > retangulo1.area()){
        System.out.println(" O retangulo 2 é maior. Com area de: " + retangulo2.area());
        System.exit(0);
    }
    else if(retangulo1.area() == retangulo2.area()){
        System.out.println("Mesma aréa: " + retangulo1.area());
    }

    scan.close();
  }
}
