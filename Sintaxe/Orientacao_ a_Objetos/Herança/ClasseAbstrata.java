abstract class Veiculo {                // Criada uma classe abstrata pra facilitar a criação 
                                        // de outras classes que usam ela como molde
                                        // diferencia-se de interfaces pois pode ser escrita 
                                        // como uma classe comum               
    abstract public void tipo();        // Um método abstrato não tem corpo
                                        // Um método pode ser feito normalmente, como se 
                                        // fosse uma class padrão
    void buzina() {                     // método criado normalmente. Faz com as classes que 
                                        // herdam reaproveitem sua funcionalidade
        System.out.println("Biiiiiii, biiiiii\n\n");
    }
}
class Carro extends Veiculo {
    public void tipo() { System.out.println("CARROOOOOOOO"); }
}
public class ClasseAbstrata {
    public static void main(String args[]) {
        Carro seila = new Carro();
        seila.tipo();       
        seila.buzina(); // note que este método não foi criado
                        // na classe "Carro", mas sim na classe abstrata "Veiculo"
    }
}