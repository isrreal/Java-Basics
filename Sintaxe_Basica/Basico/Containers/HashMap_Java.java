
import java.util.*;

public class HashMap_Java {
    public static void main(String args[]) {
        //  OBS: OS TIPOS TEM QUE SER DE CLASSES WRAP
        //  Sintaxe: Map<TipodeChave, TipodeValor> NomedoMap = new HashMap<TipodeChave, TipodeValor>();
        HashMap<Integer, String> nomes = new HashMap<Integer, String>();        
        // o método ".put" coloca algum elemento em uma chave específica
        nomes.put(1, " Israel");        
        nomes.put(2, " Silas");
        nomes.put(3, " Juraci");
        // Map copiado
        HashMap<Integer, String> copia = new HashMap<Integer, String>(nomes);       
        // retorna o map todo
        System.out.println("Aqui o map do original: " + nomes.entrySet());   
        System.out.println("Aqui o map da copia: " + copia);
        // retorna a classe 
        System.out.println(nomes.getClass());   
        // retorna somente os valores das chaves
        System.out.println(nomes.values());     
        // apaga todo o map  
        nomes.clear();                        
        System.out.println(nomes.entrySet());
        nomes.put(1, "Reformed Israel");
        nomes.put(2, "Reformed Juraci");
        System.out.println(nomes.entrySet());
        // remove uma chave e seu elemento  
        // OBS: SÓ DA PRA EXCLUIR A CHAVE, NÃO O ELEMENTO
        nomes.remove(2);                        
        System.out.println(nomes.entrySet());
        // verifica se o map está vazio e retorna um boolean
        System.out.println(nomes.isEmpty()); 
        // retorna o HashCode do map  
        System.out.println(nomes.hashCode());    
    }
}
