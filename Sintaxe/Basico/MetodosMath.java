public class MetodosMath {
    public static void main(String args[]) {
        int modulo = -2;
        int menor = 90;
        int maior = 91;
        int LogNatural = 50;
        int logaritmo = 5;
        //  O casting é pra transformar em inteiro a fim 
        //  de ser compartível com o tipo "int"
        int aleatorio = (int)Math.random();     // retorna um double aletório entre 0 e 1   
        double aleatorio2 = Math.random();
        // Sintaxe para printar um número aleatório em intervalo específico:
        //  (Math.random()* TamnahodoIntervalo);
        int aleatorio3 = (int)(Math.random() * 100);  
        int potencia = 90;                                               
        System.out.println(Math.abs(modulo));        // O método Math.abs() retorna o módulo do número requerido
        System.out.println(Math.pow(potencia, 9));   // O método Math.pow() retorna a potencia do numero requerido 
        System.out.println(aleatorio);
        //  O método Math.max() retorna o maior número entre os dois comparados
        System.out.println("Esse eh o maior termo: " + Math.max(maior, menor)); 
         // O método Math.min() retorna o menor número entre os dois comparados
        System.out.println("Esse eh o menor termo: " + Math.min(maior,menor));
        System.out.println(aleatorio2);         // Printando numeros aleatorio entre 0 e 1, com alta precisão
        System.out.println(aleatorio3);         // Printando numeros aleatorio no intervalo de 0 até 100
        // O método Math.log() retorna o logaritmo natural do número requerido
        System.out.println(Math.log(LogNatural)); 
        // O método Math.log10() retorna o logaritmo na base 10 do número requerido
        System.out.println(Math.log10(logaritmo)); 
    }
}
