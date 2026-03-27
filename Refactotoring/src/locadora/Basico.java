package locadora;

public class Basico  extends Classificacao{

    @Override
    public int getCodigoDoPreco() {
        return 1;
    }
    
    @Override
    public double getValorDaLocacao(int dias_alugados) {
        return dias_alugados * 90.0;
    }

    @Override
    public int getPontosDeAlugadorFrequente(int diasAlugado) { return 1; }

}
