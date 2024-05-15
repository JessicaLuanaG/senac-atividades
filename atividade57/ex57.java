package atividade57;

import java.util.Scanner;

public class ex57 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Biblioteca biblioteca = new Biblioteca();
        do{

        System.out.println("Escolha oque você quer fazer : ");
        System.out.println("D para Adicionar");
        System.out.println("R para adicionar emprestar");
        System.out.println("L para adicionar devolver");
        System.out.println("I para Listar");
        System.out.println("X para sair");
        char a = scan.next().charAt(0);

        

        switch (a) {
            case 'D':
            System.out.println("Qual Material adicionar");
            System.out.println("D para Adicionar Disco");
            System.out.println("R para adicionar Revista");
            System.out.println("L para adicionar Livro");
            char d = scan.nextLine().charAt(0);
                switch (d) {
                    case 'D':
                        System.out.println("Qual o nome do disco?");
                        String discoName = scan.nextLine();
                        Disco d1 = new Disco(discoName);
                        biblioteca.adicionarMaterial(d1);
                        
                        break;
                    case 'R':
                        System.out.println("Qual o nome da revista?");
                        String revistaName = scan.nextLine();
                        Revista r1 = new Revista(revistaName);
                        biblioteca.adicionarMaterial(r1);
                          
                    break;
                    case 'L':
                        System.out.println("Qual o nome do livro?");
                        String livroName = scan.nextLine();
                        Livro l1 = new Livro(livroName);
                        biblioteca.adicionarMaterial(l1);
                                
                        break;

                    default:
                    System.out.println("erro");
                        break;
                }

                break;

            case 'R':
            System.out.println("Qual Material emprestar");
            int n = scan.nextInt();
                biblioteca.empprestarMaterial(n);
            
                
                

            break;

            case 'L':
            System.out.println("Qual Material devolver");
            int v = scan.nextInt();
                biblioteca.empprestarMaterial(v);
       

            break;
            
            case 'I':
            biblioteca.listarMaterial();

            break;


            case 'X':
            System.exit(0);

        scan.close();
            break;

            default :
            System.out.println("erro, não é possivel");

                break;
        }

        } while (true);
    }
}

