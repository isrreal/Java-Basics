class Externa {
    int x = 5;
    class Interna {
        int y = 5;
    }
}

public class ClassesInternas {
    public static void main(String args[]) {
        // Sintaxe: Nomedaclasse NomedoObjetoExterno = new NomedaClasse;
        Externa exemplo_da_externa = new Externa();  
        /*  
            Sintaxe: 
                ClasseExterna.ClasseInterna NomedoObjetoInterno.new NomedaClasseInterna
        */
        Externa.Interna exemplo_da_interna = exemplo_da_externa.new Interna();                                         
        System.out.println(exemplo_da_externa.x + exemplo_da_interna.y );
    }
}