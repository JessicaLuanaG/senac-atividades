package prova;

import java.util.Scanner;

public class Avioes {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Assento [] [] aviao = new Assento [20] [11];
    for(int i = 0; i<20; i++){
        for(int j=0; j<11;j++){
            if(i<6){
                aviao[i][j] = new Assento1Classe(false);
    
            }
            else{
                aviao [i][j] = new AssentoEconomico(false);
            }
        }
    }
    do {
        System.out.println("Escreva R para reservar e X para sair");
        char c = scan.nextLine().charAt(0);
        switch (c) {
            case 'R':
            System.out.println("Escreva a poltrona onde deseja comprar o assento");
            int a = scan.nextInt();
            System.out.println("Escreva a fileira onde deseja comprar o assento");
            int b = scan.nextInt();
            aviao[b][a].reservar();
            scan.nextLine();
            

                break;
        
            case 'X':
            scan.close();
            System.exit(0);
            

                break;
        }
    } while (true);
    
    
}
}
