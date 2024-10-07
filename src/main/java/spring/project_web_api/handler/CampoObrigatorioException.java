package spring.project_web_api.handler;

public class CampoObrigatorioException extends BusinessException{

    public CampoObrigatorioException(String campo) {
        super("O Campo %s obrigatorio", campo);
    }
}
