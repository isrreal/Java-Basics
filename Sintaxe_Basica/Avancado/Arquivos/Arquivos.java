import java.io.File;            // Para manipular arquivos
import java.io.IOException;     // Para manipular erros 
public class Arquivos {
        public static void main(String args[]) {
        // Sintaxe pra criar um arquivo:    File nomequalquer = new File("NomedoArquivo.txt");
        // Ou  new File("LocalOndeoArquivoVaiSerCriado");
        File arquivo = new File("Arquivo.txt");   
        try {
            if(arquivo.createNewFile())             // Cria um novo arquivo
                // O método .getName() pega o nome do arquivo
                System.out.println("O arquivo " + arquivo.getName() + " foi criado agora"); 
            else
                System.out.println("O arquivo ja existe");
        }
        catch(IOException jooj) {     
            System.out.println("Algo deu errado");
            jooj.printStackTrace(); 
        }
    }
}