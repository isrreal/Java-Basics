class Animal {
    // método que vai ser reutilizado nas classes filhas
    public void barulho() {      
        System.out.println("esse animal nao existe ainda");
    }
}

class Gato extends Animal{
    /* 
        É necessário pôr a anotação @Override a fim comunicar
        ao compilador que esse método será sobrescrito.
        Com ele é possível identificar erros na sobrescrita 
        de métodos, como, por exemplo, a sobrescrita alterando 
        a quantidade de parâmetros do método, lançaria em erro, 
        algo que caso não houvesse colocado o "@Override" 
        não aconteceria
    */
    @Override 
    public void barulho() {                  
        System.out.println("MIAUUUUUU");
    }
}

class Cachorro extends Animal {
    @Override 
    public void barulho(){                  
        System.out.println("Au-au");
    }
}

public class Polimorfismo {
    public static void main(String args[]){
        Gato xaninha = new Gato();
        Cachorro dog = new Cachorro();
        //  perceba agora que o método de mesmo nome tem 
        //  funções diferentes em objetos de classes diferentes
        xaninha.barulho();          
        dog.barulho();
    }
}