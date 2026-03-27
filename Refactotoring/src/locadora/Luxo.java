package locadora;

public class Luxo extends Classificacao {

    @Override
    public  int getCodigoDoPreco() {
        return 3;
    }


    @Override
    public double getValorDaLocacao(int dias_alugados) {
        double subtotal = dias_alugados * 200.0;
        if(dias_alugados > 4) {
            return  subtotal *= 0.9;}
        else{
            return subtotal;
        }
    };

    @Override
    public int getPontosDeAlugadorFrequente(int diasAlugado) { 
        if (diasAlugado>2){
            return 2; }
        return 1;
    }
}
