class Carro {
    public int ano;
    public int preco;
    Carro(int a, int b) {
        this.ano = a;
        this.preco = b;
    }
    Carro(Carro requerido) {         // O construtor recebe como parâmetro o objeto que se deseja copiar
        this.ano = requerido.ano;        // os atributos do objeto novo recebe os do objeto já existente
        this.preco = requerido.preco;
    }
}

public class CopiaDeObjeto {
    public static void main(String args[]) {
        Carro carro = new Carro(1999, 9000);
        // Sintaxe: Classe nomedavariavel  new Classe(NomedoObjetopraCopiar)
        Carro copia_do_carro = new Carro(carro);      
        System.out.println(carro.ano);
        System.out.println(carro.preco);
        System.out.println(copia_do_carro.ano);     // vai printar a mesma coisa, já que o objeto foi copiado
        System.out.println(copia_do_carro.preco);
    }
}
