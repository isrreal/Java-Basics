// Uma classe não pode ter encapsulamento, ou seja, public, private ou protected          
// Sintaxe pra criar uma classe:    class nomedaclasse{ expressões; }
class Carro {    
    private String marca = "Nome padrao";
    private int preco;
    private int ano;            
    //  OBS: é possível haver dois construtores ou métodos de mesmo nome, porém,
    //  só é válido caso tenha parâmetros diferentes
    Carro(String marca, int preco, int ano){    
    /*  
        caso os parâmetros tenham nomes iguais aos dos 
        atributos, usa-se o "this.nomedoatributo" para acessar 
        diretamente o atributo requerido
    */
        this.marca = marca;         // o atributo "marca" recebe o valor do parâmetro marca
        this.preco = preco;         // o atributo "preco" recebe o valor do parâmetro preco
        this.ano = ano;             // o atributo ano recebe o valor do parâmetro ano
    }  
    /*  
        Por padrão o construtor vazio vai receber os valores padrão dos atributos)                  
        Sintaxe:   public nomedaclasse() {}     OBS: o construtor precisa ser público                        
    */ 
    public Carro() {}      
    public String getMarca(){ return marca; }
    public int getAno(){ return ano; }
    public int getPreco(){ return preco; }
}
 public class Classes {       
    public static void main(String args[]) {
        Carro fusca = new Carro("Wolkswagen", 7000, 1999);
        Carro jooj = new Carro();
        System.out.println(fusca.getMarca());
        System.out.println(jooj.getMarca());
    }
}
