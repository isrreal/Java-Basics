import java.util.*;
public class VectorLib {
    public static void main(String args[]) {
        int tamanho = 15;
        //  Sintaxe:  Vector<Integer> nomedovetor = new Vector <tipodavariavel>(tamanho);  
        //  OBS:    quando não inicializado o tamanho,  ele automaticamente inica com 10 posições 
        //  é preferível que use Arraylist ou LinkedList pois é mais prático e rápido
        Vector<Integer> vetor = new Vector <Integer>(tamanho);     // não colocam os tipos comuns, colocam: classes wrap
        for (int i = 0; i < tamanho; i++) 
            vetor.add(i);            
        for (Integer iterator: vetor)
            System.out.println(iterator);
    }
}
