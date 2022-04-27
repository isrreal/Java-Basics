import java.io.File;
public class PegarInfodoArquivo {
    public static void main(String args[]){
        File Objeto = new File("Arquivo.txt");
        if (Objeto.exists()) {
            System.out.println("Nome do arquivo: " + Objeto.getName());
            System.out.println("\n\nLocal onde esta o arquivo: " + Objeto.getAbsolutePath());
            System.out.println("\n\nDa pra escrever no arquivo?: " + Objeto.canWrite());
            System.out.println("\n\nDa pra ler o arquivo? " + Objeto.canRead());
            System.out.println("\n\nTamanho do arquivo em bytes: " + Objeto.length());
        }   
        else 
            System.out.println("The file does not exist.");
    } 
}
