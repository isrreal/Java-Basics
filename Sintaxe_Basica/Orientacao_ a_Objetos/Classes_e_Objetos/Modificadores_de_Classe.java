final class Carro {      // o modificador de classe final não permite que a classe tenha quaisquer extensões 
    //  variável static quer dizer que ela vai ser armazenada na 
    //  memória até o fim do código, ou seja, qualquer alteração vai ser salva
    static int incrementador;       
    private int ano;
    private int numero_de_rodas;
    Carro(int ano, int rodas) {
        this.ano = ano;
        numero_de_rodas = rodas;
        incrementador++;        // a cada criação de objeto, vai aumentando 1
    }
    // Quando criar uma classe ou método static, quer dizer que é possível
    // a utilizar sem sequer ter criado algum objeto antes
    public static void getIncrementador() {  System.out.println(incrementador); }
}

public class Modificadores_de_Classe {
    public static void main(String args[]) {
        Carro siena = new Carro(2000, 4);
        Carro brasilia = new Carro(1960, 4);
        Carro gol = new Carro(1990, 4);
        // Para acessar um método static, use a seguinte sintaxe:   NomedaClasse.NOmedoMétodoStatic();
        // Como o método foi declarado como static, não precisou ter criado um objeto antes pra usar ele
        Carro.getIncrementador();      
    }
}
