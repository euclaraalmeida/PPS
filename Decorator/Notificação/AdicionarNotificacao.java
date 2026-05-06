package Notificação;
// decorator abstrato
// Implementa a interface 
// Guarda uma referência a interface

public class AdicionarNotificacao implements Notificacao {
    protected Notificacao notificacao;

    public AdicionarNotificacao(Notificacao notificacao){
        this.notificacao =notificacao;
    }
    // padrao nada é adicionado aqui
    public String getMensagem(){
        return notificacao.getMensagem();

    }
}
