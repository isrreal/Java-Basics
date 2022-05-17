
class Objeto {
    private int tamanho;
    private String nome;
    private byte bit;
    public byte getBit() {
        return bit;
    }
    public Objeto() {
        this.nome = "a";
        this.tamanho = 90;
        this.bit = 56;
    }
    public Objeto(byte bit) {
        this();
        this.bit = bit;
    }
    
    @Override
    public String toString() {
        return String.format(" nome: %s     tamanho: %d     bit: %d", nome, tamanho, bit);
    }
}
public class thisConstructor {
    public static void main(String[] args) {
       Objeto objeto1 = new Objeto();
       Objeto objeto2 = new Objeto((byte)9);
       System.out.println(objeto1);
       System.out.println(objeto2);
    }
}