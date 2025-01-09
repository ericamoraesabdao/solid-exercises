package scr.exerciciobonus.notificacao;

public class NotificacaoService {
    private static Notificacao notificacao;

    public static void configurarNotificacao(Notificacao novaNotificacao) {
        notificacao = novaNotificacao;
    }

    public static void enviarNotificacao(String mensagem) {
        if (notificacao != null) {
            notificacao.enviar(mensagem);
        } else {
            System.out.println("Nenhum serviço de notificação configurado.");
        }
    }
}
