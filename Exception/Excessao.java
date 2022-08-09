public class Excessao {
    // Uma excessão é um método de tratamento de erros bastante eficiente.
    // existem dois tipos Checked e Unchecked Exceptions.
    // Checked Exceptions são reconhecidas durante o tempo 
    // de compilação, e, em oposição a isso, Unchecked Exceptions 
    // são no tempo de Execução do código(RunTime)

    // sintaxe: 
    // caso não queira utilizar o bloco try catch, coloque
    // "throws NomeDaExcessao", após a assinatura do método
    public static void main(String[] args) throws Exception {
        final byte idade = 15;
        if (idade < 18)
        // joga uma nova excessão genérica da classe Exception
            throw new Exception("Entrada não permitida");
    }
}
