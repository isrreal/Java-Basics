import java.io.File;  // Para criar arquivos
import java.io.IOException;  // Para manipular erros
import java.util.Scanner; // Para ler arquivos
public class Ler {
    public static void main(String args[]) {      
        try {
            File arquivo = new File("Arquivo.txt");        //  Coloca o nome do arquivo já existente no construtor
            Scanner leitura = new Scanner(arquivo);                 //  Criando um objeto pra ler o arquivo requerido
            while (leitura.hasNextLine()) {                         // O método .hasNextLine() verifica se o arquivo chegou no final
                String inicio = leitura.nextLine();                 // O método .nextLine() recebe o início do arquivo
                System.out.println(inicio);                         // printa o conteúdo do arquivo em si
            }
            leitura.close();         // fecha o arquivo 
        } 
        catch (IOException jooj) {
            System.out.println("Aconteceu um erro.");
            jooj.printStackTrace();
        }
    }
}


    
