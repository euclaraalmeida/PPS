package impressora;

public class pagamento {
    // O que seu sistema conhece
interface ProcessadorDePagamento {
    void pagar(double valor);
}

// Seu sistema
class SistemaDePagamento {
    void realizarPagamento(ProcessadorDePagamento processador) {
        processador.pagar(150.00);
    }
}

class AdapterPagamento implements ProcessadorDePagamento{
    private PagamentoExterno pagamentoExterno;
    public AdapterPagamento(PagamentoExterno pagamentoExterno){
        this.pagamentoExterno = pagamentoExterno;
    }
    public void pagar(double valor){
        pagamentoExterno.efetuarCobranca(valor);
    }
}

// Biblioteca terceira — você não pode alterar
class PagamentoExterno {
    void efetuarCobranca(double quantia) {
        System.out.println("Cobrança efetuada: R$ " + quantia);
    }
}

class main{
    public static void main(String[] args) {
        PagamentoExterno pagamentoExterno = new PagamentoExterno();
        AdapterPagamento adapterPagamento = new AdapterPagamento(pagamentoExterno);
        SistemaDePagamento sistemaDePagamento = new SistemaDePagamento();
        sistemaDePagamento.realizarPagamento(adapterPagamento);


    }
}
}
