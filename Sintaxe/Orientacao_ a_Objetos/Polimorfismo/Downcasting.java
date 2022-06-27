
class Pai {
    private String nome = "Classe pai";
    public void printNome() { System.out.println(this.nome); }    
}

class Filha extends Pai {
    private String nome = "Classe filha";
    @Override
    public void printNome() { System.out.println(this.nome); } 
    public void metodo() { System.out.println("Metodo da classe filha"); }
}

public class Downcasting {
    public static void main(String[] args) {
        Pai pai = new Filha();
        pai.printNome();
        Filha filha = (Filha) pai;
        filha.printNome();
        filha.metodo();
    }
}
