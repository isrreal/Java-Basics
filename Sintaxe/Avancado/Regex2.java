// import no package 
//  java.util.regex.Matcher 
//  java.util.regex.Pattern
import java.util.regex.*;

public class Teste {
    public static void main(String[] args) {
       /*
            o primeiro parâmetro de .compile(), pode ser: 
                "[]"       verifica se a string tem os valores dentro das chaves
                "[abc]"    verifica se a string tem os caracteres "abc"
                "[0-9]"    verifica se a string possui os caracteres de 0 a 9 
                "[^abc]"   verifica se a string NÃO possui os caracters "abc"
       */

        Pattern padrao = Pattern.compile("[0-9]", Pattern.CASE_INSENSITIVE);
        // procura o padrao na string indicada a partir do padrão inserido
        Matcher string = padrao.matcher("exemplo interessante");
        // .find() verifica se realmente foi encontrado a expressão  
        boolean verifica = string.find();
        if (verifica)
            System.out.println("existe");
        else
            System.out.println("nao existe");
    }
}
