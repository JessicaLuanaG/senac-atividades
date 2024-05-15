package atividade57;

public class Biblioteca  {
    private Material [] materiais; 
    public Biblioteca(){
        this.materiais  = new Material[5];
        Material l1 = new Livro("ted bundy: um estranho ao meu lado");
        Material r1 = new Revista("Veja");
        Material d1 = new Disco("K-12");
        Material l2 = new Livro ("Killer Clown");
        Material d2 = new Disco ("Brääznik");


        materiais[0] = l1;
        materiais[1] = r1;
        materiais[2] = d1;
        materiais[3] = l2;
        materiais[4] = d2;
    }

    public void adicionarMaterial(Material materiaon){
        for (Material materi : materiais) {
            if(materi==null){
                materi=materiaon;
                System.out.println("Foi possivel!");
                return;
            }
        }
        System.out.println("Impossivel bruh");
    } 

    public void listarMaterial(){
        for (Material material : materiais) {
            if (material != null){
            System.out.println(material.getNome());
            }
        }
    } 

    public void empprestarMaterial(int indice){
        materiais[indice].emprestar();
    }

    
    public void devolverMaterial(int indice){
        materiais[indice].devolver();
    }

    
}
