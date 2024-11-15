public class TamanhosDiferentesException extends RuntimeException {

    public TamanhosDiferentesException(String mensagem) {
        super(mensagem);
    }

    public TamanhosDiferentesException() {
        super("TamanhosDiferentesException");
    }

}
