public class Paypal implements FormaDePagamento {

 
    public String email;
    public String senha;

    public Paypal(String email, String senha){
            this.email = email;                 
            this.senha = senha;
    }
  public String ProcessarPedido(Double ValorTotal) {
    try:
        if (this.email != '@'){
            // vai leanr um erro
        }

        return 'Pedido processado para pagar com paypal';
    }
}

