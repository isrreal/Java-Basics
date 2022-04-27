public class Funcao {
    public static void main(String args[]){
        int num1 = 2;
        int num2 = 8;
        System.out.println(soma(num1, num2));               // chamando aqui a "função" e printando o resultado
    }
    // OBS: pra criar uma "Função" em java, é necessário a palavra chave "static"
    public static int soma(int numero1, int numero2){       
/* 
    Sintaxe:   

        public static tipoderetorno nomedafunção(parâmetros){   
            expressões; 
        }                                                            
*/
        return numero1 + numero2;
    } 
}
