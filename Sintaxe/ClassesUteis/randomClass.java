import java.util.Random;
import java.util.ArrayList;

public class randomClass {
    public static void gerarInteiros(ArrayList<Integer> inteirosAleatorios) {
        for (int i = 0; i < 20; i++) {
            Random rand = new Random();
            inteirosAleatorios.add(rand.nextInt(99999));
        }
    }
    public static void gerarFloats(ArrayList<Float> floatsAleatorios) {
        for (int i = 0; i < 20; i++) {
            Random rand = new Random();
            floatsAleatorios.add(rand.nextFloat(50.90f));
        }
    }
    public static void gerarDouble(ArrayList<Double> doublesAleatorios) {
        for (int i = 0; i < 20; i++) {
            Random rand = new Random();
            doublesAleatorios.add(rand.nextDouble(5421));
        }
    }
    public static void main(String[] args) {
        // Sintaxe:
        //      Random random = new Random(valorMaximo);
        //      random.nextInt(valorMaximo)         retorna um int
        //      random.nextFloat(valorMaximo)       retorna um float
        //      random.nextDouble(valorMaximo)      retorna um double
        ArrayList<Integer> inteirosAleatorios = new ArrayList<Integer>();
        ArrayList<Float> floatsAleatorios = new ArrayList<Float>();
        ArrayList<Double> doublesAleatorios = new ArrayList<Double>();
        gerarInteiros(inteirosAleatorios);
        gerarFloats(floatsAleatorios);
        gerarDouble(doublesAleatorios);
        System.out.print(inteirosAleatorios + " ");
        System.out.println("\n");
        System.out.print(floatsAleatorios + " ");
        System.out.println("\n");
        System.out.println(doublesAleatorios + " ");
    }
}