interface Pessoa {
    public void falar();
}
public class AnonymousInnerClass2 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa() { 
            public void falar() { System.out.println("Pessoa falando!"); } 
        };
        pessoa.falar();
    }
}
