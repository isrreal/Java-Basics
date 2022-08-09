package customExceptions;
// para fazer com que a excessão esteja verificada
// no tempo de execução, importamos a classe RunTimeException
// Excessões RunTime, não precisam ser sinalizadas após 
// a assinatura do método
public class idadeMuitoAlta extends RuntimeException {
    public idadeMuitoAlta(String message) {
        super(message);
    }
}
