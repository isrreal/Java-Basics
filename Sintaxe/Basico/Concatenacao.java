public class Concatenacao {
    public static void main(String[] args) {

        String conc = "Fui ";
        String atenado = "concatenado!";
        System.out.println("Fui " + atenado);                   //   usa o operador "+" para concatenar
        System.out.println(conc + atenado);
        // ou 
        System.out.println(conc.concat(atenado));
        System.out.println("Numero concatenado : " + 3 + 4);    // aqui ele concatena tudo literalmente
        System.out.println("Numero somado : " + (3 + 4));       //  aqui ele realmente soma porque foram isolados
    }
}






    

