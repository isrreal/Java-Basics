public class While {
    public static void main(String args[]) {        
        /*
            OBS:    é necessário a existencia de uma variável caso queira realizar algum incremento
            Sintaxe:
                while(expressão ou  comparação){
                    expressões;
                }           
        */ 
        int i = 0;
        while (i < 5) {       
            System.out.print(i);
            i++;
        }    
      //loop infinito   
        while (true)    // só precisa fzer um loop sem cláusula de parada
            System.out.println("Aqui um loop infinito");        
    }
}