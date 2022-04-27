
import java.io.FileWriter;      // Para escrever em arquivos
import java.io.IOException;     // Para manipular erros
public class Escrever {
    public static void main(String args[]) {
        try {            
            FileWriter escrever = new FileWriter("Arquivo.txt");
            escrever.write("To escrevendo coisa no ARQUIVO MANINHOW");  // método pra escrever em arquivos
            escrever.close();       // método pra fechar o arquivo
            System.out.println("O arquivo foi escrito com sucesso.");
          } 
          catch (IOException qualquernome){
            System.out.println("Ocorreu um erro");
            qualquernome.printStackTrace();
          }
    }    
}
