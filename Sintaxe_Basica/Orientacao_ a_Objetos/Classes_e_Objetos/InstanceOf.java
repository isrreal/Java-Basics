interface Implemento {
    public String getNome();
    public int getIdade();
    public float getAltura();
}

class Pessoa implements Implemento {
    private String nome;
    private int idade;
    private float altura;
    Pessoa(String nome, int idade, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        System.out.println("Um objeto foi criado!");
    }
    public String getNome(){ return nome; }
    public int getIdade(){ return idade; }
    public float getAltura(){ return altura; }
}

public class InstanceOf {
    public static void main(String args[]) {
        Pessoa elemento1 = new Pessoa("Israel", 18, 1.81f);
        if(elemento1 instanceof Pessoa)
            System.out.println(elemento1 instanceof Pessoa);
        System.out.println(elemento1.getAltura());
    }
}
