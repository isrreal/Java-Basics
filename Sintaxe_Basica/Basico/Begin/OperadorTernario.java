public class OperadorTernario {
    public static void main(String args[]) {
        int numero = 20;        
        // sintaxe:   variavel = (comparação) ? expressãocondicional : expressãocondicional;
        // famoso if / else simplificado   
        int reserva = (numero == 19) ?  9: 9000;   //ele vai receber 9000        
        System.out.println(reserva);       
    }
}
