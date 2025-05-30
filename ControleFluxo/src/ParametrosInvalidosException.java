/**
 * Exceção lançada para indicar que parâmetros inválidos foram fornecidos.
 * Esta exceção deve ser usada quando os argumentos do método não atendem aos critérios exigidos.
 */

public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}