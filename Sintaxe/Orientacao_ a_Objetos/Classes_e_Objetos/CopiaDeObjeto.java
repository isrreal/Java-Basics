class Carro {
    private int ano;
    private int preco;
    Carro(int a, int b) {
        this.ano = a;
        this.preco = b;
    }
    Carro(Carro requerido) {         // O construtor recebe como parâmetro o objeto que se deseja copiar
        this.ano = requerido.getAno();        // os atributos do objeto novo recebe os do objeto já existente
        this.preco = requerido.getPreco();
    }
    public int getAno() { return ano; }
    public int getPreco() { return preco; }
}

public class CopiaDeObjeto {
    public static void main(String args[]) {
        Carro carro = new Carro(1999, 9000);
        // Sintaxe: Classe nomedavariavel  new Classe(NomedoObjetopraCopiar)
        Carro copia_do_carro = new Carro(carro);      
        System.out.println(carro.getAno());
        System.out.println(carro.getPreco());
        System.out.println(copia_do_carro.getAno());     // vai printar a mesma coisa, já que o objeto foi copiado
        System.out.println(copia_do_carro.getPreco());
    }
}
