// O que seu sistema conhece
interface Notificador {
    void enviarNotificacao(String mensagem);
}

// Seu sistema
class SistemaDeAlertas {
    void alertar(Notificador notificador) {
        notificador.enviarNotificacao("Servidor fora do ar!");
    }
}

class AdapterEmail implements Notificador{

    private EmailService emailService;
    public AdapterEmail(EmailService emailService){
        this.emailService = emailService;
    }
    public void enviarNotificacao(String Mensagem){
        emailService.sendEmail(Mensagem);
    }

}
// Biblioteca terceira — você não pode alterar
class EmailService {
    void sendEmail(String body) {
        System.out.println("Enviando e-mail: " + body);
    }
}

class main{
    public static void main(String[] args) {
        EmailService emailService = new EmailService();
        AdapterEmail adapterEmail = new AdapterEmail(emailService);
        SistemaDeAlertas sistemaDeAlertas = new SistemaDeAlertas();
        sistemaDeAlertas.alertar(adapterEmail);

    }
}