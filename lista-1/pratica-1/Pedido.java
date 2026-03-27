public class Pedido{
    public FormaDePagamento formaDePagemento;
    public Double ValorTotal;

    public Double finalizarCompra(){
        this.FormaDePagemento.ProcessarPedido(this.ValorTotal);
    };
}