public class atividade40 {
    public static void main(String[] args) {
      int[] vet = {1,2,3,4,5,6,7,8,9,10};
      int ac = 0;
      for (int i : vet) {
        if (i%2 == 0){
            ac += i;
        }
      }
      System.out.println(ac);
    }  
}
