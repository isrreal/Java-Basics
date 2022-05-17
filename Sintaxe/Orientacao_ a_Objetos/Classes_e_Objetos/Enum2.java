public class Enum2 {
    enum Semaforo {
        // constantes inicializadas dentro do enum
        VERMELHO("PARE"), AMARELO("ATENCAO"), VERDE("PROSSIGA");
        private String action;
        // ja que é privado, cada valor dos argumentos do construtor vão receber 
        // os que ja foram colocados acima
        private Semaforo(String action) { this.action = action; }
        // retorna cada valor das constantes
        public String getAction() { return this.action; }
    }
    public static void main(String[] args) {
        Semaforo[] vetor = Semaforo.values();
        for (Semaforo i: vetor) {
            // .name() retorna os nomes das constantes inicializadas
            System.out.println("name: " + i.name() + " action: " + i.getAction());
        }
    }
}
       
