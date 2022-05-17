public class Enum1 {
    enum Semana {
        SEGUNDA,
        TERCA,
        QUARTA,
        QUINTA, 
        SEXTA;
        // caso o enum tenha construtor, ele necessita ser privado.
        private Semana() {
            System.out.println("valor: " + this.toString());
        }
        public static void printar() {
            System.out.println("Metodo do enum");
        }
        // os metodos do enum devem ser static
        public static String getSegunda() {
            return String.format("%s", SEGUNDA);
        }
        @Override
        public String toString() {
            return super.toString();
        }
    }
    public static void main(String[] args) {
        Semana semana = Semana.TERCA;
        // .values() retorna os valores das constantes 
        Semana[] array = Semana.values(); 
        for (Semana s: array)
        // .ordinal() printa os indices originais das constantes
            System.out.println(s.ordinal());
        // .valueOf()  retorna a constante enum caso a String do parametro seja true    
        System.out.println(Semana.valueOf("SEGUNDA")); 
        System.out.println(Semana.getSegunda());
    }   
}