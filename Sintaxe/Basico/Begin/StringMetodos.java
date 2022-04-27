public class StringMetodos {
    public static void main(String args[]) {
        String exemplo1 = "minusculo";
        String exemplo2 = "MAIUSCULO"; 
        System.out.println(exemplo1.toUpperCase()); // pra ficar maiúsculo
        System.out.println(exemplo2.toLowerCase()); // pra ficar minusculo
        System.out.println(exemplo2.toString());    // retorna o valor da String
        System.out.println(exemplo2.charAt(2));   // retorna o valor índice específico na String
        System.out.println(exemplo1.equals(exemplo2));  // compara as Strings e retorna um boolean 
        System.out.println(exemplo2.compareTo(exemplo1)); //  compara as duas string e retorna 0 se forem literalmente                                                          
                                                          // iguais, caso contrario, retorna algum numero diferente de 0    
        System.out.println(exemplo1.compareToIgnoreCase(exemplo2));   // compara sem considerar a case da String	
        System.out.println(exemplo1.hashCode());    // retorna o hashcode da string
        System.out.println(exemplo2.isEmpty());     // verifica se está vazio e retorna um boolean  
    }    
}
