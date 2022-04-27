//  import pacote.nome.Classe;         para importar classes específicas da lib     
//  import pacote.nome.*;              para importar toda a lib
import java.util.Scanner;           // import java.util.* ;  tambem funcionaria, e importaria toda a lib ".util"
class Includes {
  public static void main(String[] args) {
    Scanner objeto = new Scanner(System.in);
    System.out.println("Digite o nome");    
    String nome = objeto.nextLine();
    System.out.println("O nome digitado eh: " + nome);
  }  
}