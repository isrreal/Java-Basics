// import no package 
//  java.util.regex.Matcher 
//  java.util.regex.Pattern
import java.util.regex.*;

public class Regex {
    public static void main(String[] args) {
       /*  a classe Pattern é onde se insere o padrão para ser procurado na classe Matcher
            para instanciar:
                Pattern nome = Pattern.compile("expressao", flag )
        tipos de flags:
            Pattern.CASE_INSENSITIVE;
            Pattern.LITERAL;
            Pattern.CANON_EQ; */
        Pattern padrao = Pattern.compile("int", Pattern.CASE_INSENSITIVE);
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
