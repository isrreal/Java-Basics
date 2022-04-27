import java.util.*;
class Lambda{
    public static void main(String args[]){
        ArrayList<Integer> jooj = new ArrayList<Integer>();
        int auxiliar = (int)(Math.random() * 1000);
        while(jooj.size() != 15)
            jooj.add(auxiliar);      
        // Sintaxe: (parâmetro) -> expressão ou retorno;
        // São majoritariamente usadas para fazer operações com containers
        // precisa serem atribuídas a algo, variáveis ou métodos.
        jooj.stream().forEach((jiij)-> System.out.println(jiij + " ")); 
    }
}