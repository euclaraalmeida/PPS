package locadora;
public class Familia extends Classificacao{

    @Override
    public int getCodigoDoPreco() {
        return 2;
    }
    
    @Override
    public double getValorDaLocacao(int dias_alugados) {
        return dias_alugados * 130;
    }

    @Override
    public int getPontosDeAlugadorFrequente(int diasAlugado) { return 1; }
}
