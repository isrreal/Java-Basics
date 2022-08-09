package customExceptions;

// para fazer uma excessão genérica, importa-se a classe Exception
public class idadeMenorQueZero extends Exception {
    public idadeMenorQueZero(String message) {
        // no construtor da Excessão genérica, invoque o da classe pai
        super(message);
    }
}
