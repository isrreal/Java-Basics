package customExceptions;
import java.util.Scanner;

public class customException {
    public static void main(String[] args) throws idadeMenorQueZero {
        Scanner cin = new Scanner(System.in);
        final int idade = cin.nextInt();
        cin.close();
        if (idade < 0)
            throw new idadeMenorQueZero("Entrada inválida, idade não pode ser menor que 0");
        else if (idade > 160)
            throw new idadeMuitoAlta("Entrada inválida, idade maior que 160");
        else
            System.out.println("sua idade " + idade);
    }
}
