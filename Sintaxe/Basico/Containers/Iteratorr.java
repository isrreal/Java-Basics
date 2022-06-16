import java.util.ArrayList;
import java.util.Iterator;
public class Iteratorr {
    public static void main(String[] args){
        ArrayList<Integer> jooj = new ArrayList<Integer>();
        jooj.add(1);
        jooj.add(22);
        jooj.add(3);
        // Sintaxe Iterator <TipodeDado> NomeQualquer = nomedoarray.iterator();
        // OBS: O TIPO DE DADO TEM QUE SER IGUAL AO DO TIPO DO ARRAY QUE SE QUER ITERAR
        Iterator<Integer> it =   jooj.iterator();   
        // O método .hasNext retorna true caso exista algum elemento consequente 
        while(it.hasNext()) {       
            // .next() retorna o primeiro elemento do array       
            Integer a = it.next();
            if (a < 10)
            // apaga o elemento do iterator     "NAO SUPORTA ARGUMENTOS"
                it.remove();            
        }    
        System.out.println(jooj);
    }
}
