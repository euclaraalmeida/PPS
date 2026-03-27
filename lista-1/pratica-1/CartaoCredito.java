public class CartaoCredito implements FormaDePagamento {
 
        public Integer N_cartao;
        public data expiracao;
        public Integer cds;

        public CartaoCredito(Integer N_cartao, data expiracao,Integer cds){
            this.N_cartao = N_cartao;
            this.expiracao = expiracao;
            this.cds = cds;
         }
   public String ProcessarPedido(Double ValorTotal){   
    //   a gnt pegaria os atributos 
     return 'pedido processado para pagar com cartao de credito'
    }
    }
