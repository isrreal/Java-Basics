// Comparator possui apenas o método:
//      compareTo(Obj obj1)

// Comparable promove uma funcionalidade de comparação "natural"
// logo, não personalizada
import java.lang.Comparable;
// sintaxe:
//      class Exemplo Comparable<Exemplo> {...}

class Pessoa implements Comparable<Pessoa> {
    byte idade;
    String nome;
    public Pessoa(byte idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }
    public byte getIdade() { return this.idade; }
    public String getNome() { return nome; }
    @Override
    // comparação pelo atrributo idade
    public int compareTo(Pessoa pessoa) {
        return Integer.compare(getIdade(), pessoa.getIdade());
    }
}

public class Comparablee {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa((byte)19, "Israel");
        Pessoa pessoa2 = new Pessoa((byte)18, "Artur");
        System.out.println(pessoa.compareTo(pessoa2));
    }
}