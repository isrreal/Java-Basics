class Animal {
    public void fazerBarulho() { System.out.println("fazendo barulho de animal!"); }
}

class Gato extends Animal {
    @Override
    public void fazerBarulho() { System.out.println("miau"); }
    public void Rosnar() { System.out.println("rosnando..."); }
}

public class Upcasting {
    public static void main(String[] args) {
        // upcasting padrão que a JVM faz, ou seja, 
        // gato ainda é uma instância de Animal, portanto, pode utilizar seu métodos
        Animal gato = new Gato();
        // Animal gato = new Gato() ==  Gato gato = new Gato()
        fazerBarulho(gato);
    }
    public static void fazerBarulho(Animal animal) {
        // observe que a class Animal não possui o método rosnar(),
        // portanto, é extremamente mais útil especificar uma classe nos argumentos
        // no caso, a classe Gato 
        animal.fazerBarulho();
        // animal.rosnar()  resultaria em erro
    }
}
