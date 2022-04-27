public class Arrays {
    public static void main(String jooj[]){
        int array[] = {123, 265, 3, 4, 5, 6};   // sintaxe:    tipo[] nomedavariavel; ou tipo nomdedavariavel[];
        String nomes[] = new String[10];        // alocado previamente          
                                                //Sintaxe: Tipodedado[] nomequalquer = new tipodedado[tamanhorequerido]
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);        
        for (int i = 0; i < nomes.length; i++){
            nomes[i] = "Israel";
            System.out.println(nomes[i]);
        }
    }
}
