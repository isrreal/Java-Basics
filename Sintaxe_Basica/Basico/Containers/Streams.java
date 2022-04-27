import java.util.*;
public class Streams {
    public static void main(String Args[]){
        ArrayList <Integer> numeros = new ArrayList <Integer>();
        int a = 22;
        while(numeros.size() != 20){         
            numeros.add(a);
            a *= 2;
        }       
        numeros.stream().forEach((num) -> System.out.print(num + " "));
    }
}
