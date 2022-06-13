// Comparator possui apenas 2 métodos:
//      equals(Obj obj) e compare(Obj obj1, Obj obj2)

// Comparator promove uma funcionalidade de comparação "Personalizada"
import java.util.Comparator;
// sintaxe:
//      class Exemplo Comparator<Exemplo> {...}

class Estudante implements Comparator<Estudante> {
    byte idade;
    String nome;
    int matricula;
    public Estudante(byte idade, String nome, int matricula) {
        this.idade = idade;
        this.nome = nome;
        this.matricula = matricula;
    }
    public byte getIdade() { return this.idade; }
    public String getNome() { return this.nome; }
    public int getMatricula() { return this.matricula; }
    @Override
    // comparação pelo atributo idade
    public int compare(Estudante estudante, Estudante estudante2) {
        return estudante.getMatricula() - estudante2.getMatricula();
    }
}

public class Comparatorr {
    public static void main(String[] args) {
        Estudante estudante = new Estudante((byte)19, "Israel", 11111111);
        Estudante estudante2 = new Estudante((byte)18, "Artur", 00000001);
        // estudante > estudante2
        System.out.println(estudante.compare(estudante, estudante2));
    }
}