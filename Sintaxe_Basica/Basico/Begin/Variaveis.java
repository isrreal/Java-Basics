public class Variaveis {
    public static void main(String args[]) {
        int inteiro = 12;
        inteiro = 1;
        int a = 1, b = 2, c = 3;        // declaração múltipla de varíaveis        OBS: só funciona pro mesmo tipo de dado
        char letrinha = 'A';            // char necessita ter aspas simples
        String texto = "Alguma coisa";  //  String necessita de aspas duplas 
                                        //  Strings são consideradas objetos, portanto, toda alteração deve ser realizada por uma nova instanciação
        float flutuante = 3.314159f;    // para declarar um float, precisa colocar um "f" no final do numero 
        double numero_preciso = 12.456475687589; 
        boolean bool = true;  
        final int jooj = 10;        // declaração de uma constante, só colocar a palavra chave
                                    // antes da declaração da variável
        byte horas = 24;            // variavel inteira cujo valor máximo é até 256
        short salario = 9000;       // inteiro com um baxo valor máximo
        System.out.println("O valor de \"inteiro\" foi sobrescrito pra : " + inteiro);       
        System.out.println(flutuante);        
        System.out.println("Aqui um numero com dupla precisao: " + numero_preciso);         
        System.out.println(texto);        
        System.out.println(letrinha);
        System.out.println(a * b * c);
        System.out.println(bool);
        System.out.println(a < b);    // isso  retorna um boolean
        System.out.println("Essa daqui eh uma variavel constante, ou seja, nao da pra mudar o valor dela subsequentemente: " + jooj);
    }  
}
