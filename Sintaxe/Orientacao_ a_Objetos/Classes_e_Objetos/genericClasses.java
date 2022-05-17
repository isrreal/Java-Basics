class Generica<T> {
    private T atributo;
    public Generica(T atributo) {
        System.out.println("Objeto generico criado");
        this.atributo = atributo;
    }
    public Generica(Generica<T> objeto) { this.atributo = objeto.getAtributo(); }
    public void setAtributo(T atributo) { this.atributo = atributo; }
    public T getAtributo() { return atributo; }
}
public class genericClasses {
    public static void main(String[] args) {
        Generica<String> generica = new Generica<String>("Cringe");
        System.out.println(generica.getAtributo());
        generica.setAtributo("atributo alterado");
        System.out.println(generica.getAtributo());
    }
}