package locadora;

public interface AlugaveisInt {

    public int getAno();

    public String getDescricao();

    public Double ValorLocacao(int dias_alugados);
    
    public int calculoPontoPorCarro(int dias_alugados);
    
}   
