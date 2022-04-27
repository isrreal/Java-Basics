import java.util.Scanner;       // lib pra pegar a classe Scanner
import java.math.BigInteger;
import java.math.BigDecimal;
public class Entrada {
    public static void main(String args[]) {
    // na criação de um objeto da classe Scanner, é possível o reutilizar fazendo ler diferentes tipos de dados
        Scanner objeto = new Scanner(System.in);  // sintaxe: Scanner nomequalquer = new Scanner(System.in);         
        System.out.println("Digite seu nome\n");
        String nome = objeto.nextLine();                 
    /* 
        para usar o método de entrada, usa-se:  

            .nextLine() --> Formata a entrada como String com espaço
            .nextDouble()   --> Formata a entrada como um Double
            .nextBigDecimal()  --> Formata a entrada como um BIgDecimal
            .nextBigInteger()  --> formata a entrada como um BigInteger
            juntamente com o objeto criado anteriormente, ou seja, o 
            "objetocriado"
    */
        System.out.println("Digite um BIg Integer\n");
        BigInteger bigint = objeto.nextBigInteger();        // observe que o mesmo Scanner foi utilizado para ler muitas variáveis distintas
        System.out.println("Digite um Big Decimal\n");
        BigDecimal bigdec = objeto.nextBigDecimal();
        System.out.println("Este eh o o nome que voce escreveu: " + nome);
        System.out.println("Esse eh o big integer lido do teclado: " + bigint);
        System.out.println("Esse eh o big decimal lido do teclado: " + bigdec);
    }
}