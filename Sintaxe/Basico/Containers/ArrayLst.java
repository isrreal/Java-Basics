import java.util.ArrayList;

class ArrayLst {
/*
    A diferença entre ArrayList e o LinkedList é justamente porque para alterar algo 
    no Arraylist, é preciso literalmente criar um array novo e destruir o antigo toda 
    vez que ocorre alguma alteração.Agora no LinkedList é só modificar o mesmo array 
    pra modificar ele, pois é um ponteiro novo na memória é criado para o 
    endereço novo
*/
    public static void main(String args[]) {    
         // OBS: OS TIPOS TEM QUE SEREM DE CLASSES WRAP        
        // Sintaxe: ArrayList < TipoWrap > nomedavariavel = new ArrayList <TipoWrap>(tamanho)
        // Por padrão, o número de posições , inicialmente, é 10;
        ArrayList<String> jooj = new ArrayList<String>(); 
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        int a = 2;
        int b = 3;
        jooj.add("aaaaa");
        jooj.add("bbbbb");
        // não é preciso um loop pra printar um elemento de cada vez, basta fazer isso:
        System.out.println(jooj);       
        System.out.println("\n\n");
        jooj.clear();       // apaga todos os elementos do array
        System.out.println(jooj.isEmpty());      // verifica se está vazio e retorna um boolean
        System.out.println("\n\n");
        while(numeros.size() != 20) {            // melhor usar um loop while para adicionar valores automáticos       
            numeros.add(a);
            a *= 2;
        }
        System.out.println(numeros);
        numeros.clear();
        for (int i = 0; i < 20; i++) {     // loop for também funciona
            numeros.add(b);
            b+= 5;
        }
        System.out.println("\n\n");
        System.out.println(numeros);
        numeros.remove(0);          // remove o elemento do array por índice
        System.out.println("\n\n");
        System.out.println(numeros);    
    }
}