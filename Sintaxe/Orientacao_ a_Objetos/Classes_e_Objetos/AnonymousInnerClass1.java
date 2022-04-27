// pode ser classe comum
abstract class Pessoa { 
     void falar() {
        System.out.println("Modelo da classe abstrata!");
    };
}

public class AnonymousInnerClass1 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa() {
            void falar() { System.out.println("pessoa falando!"); }
        };
        pessoa.falar();
    }
}
