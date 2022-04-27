
class Animal {
    protected int patas = 0;
    protected String raca = "jooj"; 
}
// para herdar, precisa pôr a palavra-chave "extends" e depois a classe pai
class Leao extends Animal {  
    // nesse caso,  a classe "Leao" herda Animal    
    Leao(int i, String r) {
        this.patas = i;
        this.raca = r;
    }
}

public class Heranca {
    public static void main(String args[]) {
        Leao aa = new Leao(4, "Felino");
        System.out.println(aa.raca);
    }
}
