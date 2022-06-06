import java.util.LinkedList;
 /*
    A diferença entre ArrayList e o LinkedList é justamente porque para alterar algo 
    no Arraylist, é preciso literalmente criar um array novo e destruir o antigo toda 
    vez que ocorre alguma alteração.Agora no LinkedList é só modificar o mesmo array 
    pra modificar ele, pois é um ponteiro novo na memória é criado para o 
    endereço novo
*/
public class LinkedLst {
    public static void main(String args[]){
        LinkedList<String> lista = new LinkedList<String>();    // Sintaxe:   LinkedList nome = new LinkedList(TamanhodaLista); 
        lista.addFirst("jooj");     // Adiciona um elemento no início da lista
        lista.addLast("jeej");      // Adiciona um elemento no fim da fila
        lista.addLast("ultimo");
        lista.addFirst("na frente");
        System.out.println("Lista com elementos adicionados " + lista);
        lista.removeFirst();    // Remove o primeiro elemento da lista
        lista.removeLast();     // Remove o último elemento da lista
        System.out.println("Esta aqui a lista sem o primeiro e ultimo elementos: " + lista);
        // Retorna o primeiro elemento
        System.out.println("Aqui esta o primeiro elemento da lista: " + lista.getFirst()); 
        // Retorna o último elemento
        System.out.println("Aqui esta o ultimo elemento da lista: " + lista.getLast()); 
        lista.clear();  // apaga a lista
        System.out.println(lista.isEmpty());    // Verifica se a lista está vazia e retorna um boolean
    }    
}
