
public class ParametrosInvalidosException extends Exception {

    public ParametrosInvalidosException() {
        super("O segundo parâmetro deve ser maior que o primeiro"); // exibe a messangem de error quando cai no catch
    }

}
