import java.util.Scanner;

public class atividade47 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);


    System.out.println("Ano carro: ");
    int anoc1 = scan.nextInt();
   

    Carro carro1 = new Carro("marcc1", "modelc1", anoc1, "corc1"); 


    System.out.println("Ano carro: ");
    int anoc2 = scan.nextInt();

    Carro carro2 = new Carro("marcc2", "modelc2", anoc2, "corc2"); 
   
 
    System.out.println("Ano carro: ");
    int anoc3 = scan.nextInt();


    Carro carro3 = new Carro("marca3", "model3", anoc3, "corc3"); 
   

    if (carro1.getAno()>carro2.getAno()){
        if(carro2.getAno()>carro3.getAno()){
            System.out.println("Mais velho: carro 1 com " + carro1.getAno() + " Segundo mais velho: carro 2 com " + carro2.getAno() + " Carro mais novo: Carro 3 com " + carro3.getAno());
            System.exit(0);
        }
        if(carro1.getAno()>carro3.getAno()){
        System.out.println("Mais velho: carro 1 com " + carro1.getAno() + " Segundo mais velho: carro 3 com " + carro3.getAno() + " Carro mais novo: Carro 2 com " + carro2.getAno());
        System.exit(0);
    }
    }
    if (carro2.getAno()>carro1.getAno()){
        if(carro1.getAno()>carro3.getAno()){
            System.out.println("Mais velho: carro 2 com " + carro2.getAno() + " Segundo mais velho: carro 1 com " + carro1.getAno() + " Carro mais novo: Carro 3 com " + carro3.getAno());
            System.exit(0);
        }
        if(carro2.getAno()>carro3.getAno()){
        System.out.println("Mais velho: carro 2 com " + carro2.getAno() + " Segundo mais velho: carro 3 com " + carro3.getAno() + " Carro mais novo: Carro 1 com " + carro1.getAno());
        System.exit(0);
    }
    }
    if (carro3.getAno()>carro1.getAno()){
        if(carro1.getAno()>carro2.getAno()){
            System.out.println("Mais velho: carro 3 com " + carro3.getAno() + " Segundo mais velho: carro 1 com " + carro1.getAno() + " Carro mais novo: Carro 2 com " + carro2.getAno());
            System.exit(0);
        }
        System.out.println("Mais velho: carro 3 com " + carro3.getAno() + " Segundo mais velho: carro 2 com " + carro2.getAno() + " Carro mais novo: Carro 1 com " + carro1.getAno());
        System.exit(0);
    }
    scan.close();
   }
}
