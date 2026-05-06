package Notificação;

public class main {
    public static void main(String[] args) {
        NotificacaoSimples notificacaoSimples = new NotificacaoSimples();
        AdicionarNotificacao adicionarNotificacao = new AdicionarNotificacao(notificacaoSimples);
        NotificacaoUrgente notificacaoUrgente = new NotificacaoUrgente(notificacaoSimples);


        System.out.println(notificacaoSimples.getMensagem());
        System.out.println(notificacaoUrgente.getMensagem());
    }
}
