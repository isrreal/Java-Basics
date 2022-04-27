
import java.util.*;
public class Streams {    
    /*  
        Sintaxe:
        container.stream().método(parâmetros)               OBS:  os parâmetros, majoritariamente, são expressões lambda
    */ 
    public static void main(String args[]) {
        ArrayList<Integer> jooj = new ArrayList<Integer>();
        int n = 2;
        while(jooj.size() != 20){
            jooj.add(n);
            n *= 2;
        }
        //  .forEach()

        //  Funciona como o for each padrão, mas usando expressão lambda 
        jooj.stream().forEach((aaa) -> System.out.print(aaa + ", "));           
        System.out.println(); 
        //  .allMatch() 

        //  Verifica se TODOS os elementos do container atende os parâmetros e retorna um boolean         
        System.out.println(jooj.stream().allMatch((asd) -> asd < 1000));        

        //  .anyMatch()

        //  Verifica se PELO MENOS UM elemento do container atende os parâmetros e retorna um boolean 
        System.out.println(jooj.stream().anyMatch((asd) -> asd == 1024)); 
        System.out.println();

        //  .noneMatch()

        //  Verifica se NENHUM elemento do container atende os parâmetros e retorna um boolean 
        System.out.println(jooj.stream().noneMatch((aaa)-> aaa < -2));        
        
        //  .count();

        //  Para contar quantos elementos tem no container   (melhor usar o método .size())
        System.out.println(jooj.stream().count());   

        //  .takeWhile()

        //   Itera uma stream obtendo elementos até que algum deles não corresponda 
        //   ao que foi fornecido retornando uma nova stream os descartando.

        jooj.stream().takeWhile((asd)-> asd % 2 == 0); 
        System.out.println(jooj);

        // .dropWhile()

        // Itera uma stream e descarta os elementos que atendem parâmetros
        jooj.stream().dropWhile(a-> a > 256);
        System.out.println(jooj);               
    }
}
