public class DicentePosGraduacao extends Dicente {
        private String tese;
        private String orientador;

        public DicentePosGraduacao(String nome, double nota1, double nota2, double nota3, String tese, String orientador){
            super(nome, nota1, nota2, nota3);
            this.tese = tese;
            this.orientador = orientador;
        }

        public void enviarTese(){
            System.out.println("teseEnviada");
        }
        public void imprimirResultado(){
            System.out.println(nome + " " + nota1 + " " + nota2 + " " + nota3 + " " + tese + " " + orientador);
        }
}
