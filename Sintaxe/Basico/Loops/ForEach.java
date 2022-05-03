import java.util.ArrayList;
public class ForEach {
    public static void main (String args[]) {
        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("israel");
        nomes.add("jooj");
        for (String jooj: nomes){       // Sintaxe:   TipoDoContainer nomedavariavel : container { }
                                        /* 
                                            OBS 1:  No for each, para "usar" o container, utiliza o nome da                                             
                                            variavel criada durante a criação do loop, uma copia do container, 
                                            não o nome do container em si
                                        */         
            System.out.println(jooj);   
        }
    }    
}
