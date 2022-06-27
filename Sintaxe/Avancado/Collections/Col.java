import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Carro {
    private String marca;
    private float preco;
    public Carro(String marca, float preco) {
        this.marca = marca;
        this.preco = preco;
    }
    public String getMarca() { return this.marca; }
    public float getPreco() { return this.preco; } 
    @Override
    public String toString() {
        return this.marca + " preco: " + this.preco + "\n";
    }
}
class ComparaCarro implements Comparator<Carro> {
    @Override 
    public int compare(Carro carro1, Carro carro2) {
        return (int)carro1.getPreco() - (int)carro2.getPreco();
    }
}
public class Col {
    public static void main(String[] args) {
        Carro fusca = new Carro("Wolkswagen", 6503.25f);
        Carro corolla = new Carro("toyota", 102000.4f);
        Carro brasilia = new Carro("Wolkswagen", 6542.45f);
        List<Carro> carros = new ArrayList<Carro>();
        carros.add(fusca);
        carros.add(corolla);
        carros.add(brasilia);
        Collections.sort(carros, new ComparaCarro());
        System.out.println(carros);
    }
}
