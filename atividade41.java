public class atividade41 {
    public static void main(String[] args) {
        int[] vet = {-1,2,3,4,5,6,7,8,9,0};
        int pc = 0;
        int nc = 0;
        int zc = 0;
        for (int i : vet) {
          if (i > 0){
              pc += 1;
          }
          if(i<0){
            nc += 1; 
          }
          else if (i == 0){
            zc += 1;
          }
        }
        System.out.println("positivos: " + pc + ", zeros: " + zc + ", negativos: " + nc);
      }  
}
