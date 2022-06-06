class Exemplo {
    private String string = "";
    public Exemplo(String str) {
        this.string = str;
    }
    public void metodoDaClassePai() {
        System.out.println("metodo da classe pai");
    }
    public String getString() { return this.string; }
}

class ExemploFilho extends Exemplo {
    private int numero;
    public ExemploFilho(String str, int numero) {
        // usando o construtor da classe pai
        // agora é possível utilizar os métodos da classe pai 
        // agora parametrizados
        super(str);
        this.numero = numero;
    }
    public void metodoDaClasseFilha() {
        System.out.println("metodo da classe filha");
    }
    public int getNumero() { return this.numero; }
}
public class Heranca2 {
    public static void main(String[] args) {
        ExemploFilho e = new ExemploFilho("jooj", 999);
        // utilizando o método da classe Pai
        System.out.println(e.getString());
        // aqui também
        e.metodoDaClassePai();
    }
}