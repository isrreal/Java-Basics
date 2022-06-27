/*
    - Uma interface suporta apenas atributos constantes estáticos  e "final"
    - É utilizada quando queremos que a classe que herda, obrigatoriamente use seus métodos
      Ou seja, ocorre um erro caso não utilize todos os seus métodos
    - uma interface apenas suporta métodos abstratos
*/
    interface Veiculo {           //  Funciona como uma entidade, portanto, não precisa da palavra-chave  "class"
        public void tipo();       //  Em uma interface, só coloca assinaturas de métodos,
                                  //  ou seja, só declara, mas não cria um corpo pra ela
        public void custo();     
    }
class Carro implements Veiculo {     // Carro implementa a interface Veiculo
    public void tipo() { System.out.println("CARROOOOOOOO"); }
    public void custo() { System.out.println(9000); }
}    
public class Interface {
    public static void main(String args[]){
        Carro seila = new Carro();
        seila.tipo();
        seila.custo();
    }
}