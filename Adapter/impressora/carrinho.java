package impressora;
// Desconto 1 — Cliente VIP: 20% de desconto
// Desconto 2 — Cliente comum: 5% de desconto
// Desconto 3 — Sem desconto: valor cheio
// System.out.println("Total: R$" + (valor - valor * 0.20)); // exemplo 20%
   
// Contexto
public class carrinho {
    private double valorTotal;
    private Innercarrinho innercarrinho;

    public carrinho(double valorTotal, Innercarrinho innercarrinho) {
        this.valorTotal = valorTotal;
        this.innercarrinho = innercarrinho;
    }

    void calcularDesconto() {
        innercarrinho.preCalculo(valorTotal);
    }

}

public interface Innercarrinho {
    void preCalculo(double valorTotal);
}

public class ClienteVip implements Innercarrinho{
    public void preCalculo(double valor){
        System.out.println("Total: R$" + (valor - valor * 0.20)); 

    }
}


public class ClienteComum implements Innercarrinho{
    public void preCalculo(double valor){
        System.out.println("Total: R$" + (valor - valor * 0.05)); 

    }
}

public class ClienteSemDesconto implements Innercarrinho{
    public void preCalculo(double valor){
        System.out.println("Total: R$" + valor); 

    }
}

public class main {
    public static void main(String[] args) {
        ClienteVip clienteVip = new ClienteVip();
        carrinho carrinho = new carrinho(200,clienteVip);
        carrinho.calcularDesconto();

    }
}
}