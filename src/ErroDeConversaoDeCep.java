public class ErroDeConversaoDeCep extends RuntimeException {
    private String mensagem;

    public ErroDeConversaoDeCep(String mensagem){
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
