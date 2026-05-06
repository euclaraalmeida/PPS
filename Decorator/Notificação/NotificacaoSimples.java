package Notificação;
// Componente base -> implementa  a interface com valores reais

public class NotificacaoSimples implements Notificacao {
    public String getMensagem() {
        return "Você tem uma mensagem";
    }
}