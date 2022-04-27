import java.util.*;
public class Iteratorr {
    public static void main(String args[]){
        ArrayList <Integer> jooj = new ArrayList<Integer>();
        jooj.add(1);
        jooj.add(2);
        jooj.add(3);
        // Sintaxe Iterator <TipodeDado> NomeQualquer = nomedoarray.iterator();
        //OBS: O TIPO DE DADO TEM QUE SER IGUAL AO DO TIPO DO ARRAY QUE SE QUER ITERAR
        Iterator<Integer> it =   jooj.iterator();  
        System.out.println(it.next());      // retorna o primeio elemento do array
        while(it.hasNext()) {           // O método .hasNext retorna true caso exista algum elemento consequente 
            Integer a = it.next();
            if(a < 10)
                it.remove();                // apaga o elemento do iterator     "NAO SUPORTA ARGUEMENTOS"
        }   
        System.out.println(jooj);
    }
}
