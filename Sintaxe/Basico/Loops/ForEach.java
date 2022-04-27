public class ForEach {
    public static void main ( String args[]) {
        String[] nomes = { "Israel", "Jeronimo", "Vanessa", "Valeria" };

        for (String jooj: nomes){       // Sintaxe:   Tipo nomedavariavel : container { }
                                        /* 
                                            OBS 1:  No for each, para "usar" o container, utiliza o nome da                                             
                                            variavel criada durante a criação do loop, uma copia do container, 
                                            não o nome do container em si
                                        */        
                                        // OBS 2: Só é possível fazer um forEach com containers primitivos 
            System.out.println(jooj);   // veja que foi usado o nome da variável, não o do container
        }
    }    
}
