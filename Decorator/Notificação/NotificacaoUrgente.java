package Notificação;
//decorator concreto
// sobrescrev o metodo adicionando eles

public class NotificacaoUrgente extends AdicionarNotificacao {
    public NotificacaoUrgente(Notificacao notificacao)
         {super(notificacao);}
    
        @Override
        public String getMensagem(){
            return "[Urgente] " + notificacao.getMensagem();
        }
}
