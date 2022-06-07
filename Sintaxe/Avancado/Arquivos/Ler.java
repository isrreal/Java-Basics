import java.io.File;  // Para criar arquivos
import java.io.IOException;  // Para manipular erros
import java.util.Scanner; // Para ler arquivos
public class Ler {
    public static void main(String args[]) {      
        try {
            // Coloca o nome do arquivo já existente no construtor
            File arquivo = new File("Arquivo.txt");        
            //  Criando um objeto pra ler o arquivo requerido
            Scanner leitura = new Scanner(arquivo);                
            // hasNextLine() verifica se o arquivo chegou no final
            while (leitura.hasNextLine()) {                         
                // nextLine() recebe o início do arquivo
                String inicio = leitura.nextLine();                 
                // printa o conteúdo do arquivo em si
                System.out.println(inicio);                         
            }
            // fecha o arquivo 
            leitura.close();        
        } 
        catch (IOException jooj) {
            System.out.println("Aconteceu um erro.");
            jooj.printStackTrace();
        }
    }
}


    
