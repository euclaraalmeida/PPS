package locadora;

public class Automovel implements AlugaveisInt {

	  private String descricao;
	  private String placa;
	  private int ano; // Ano de fabricacao
	  private Classificacao classificacao;
	  
	  public static final int BASICO = 1;
	  public static final int FAMILIA = 2;
	  public static final int LUXO = 3;


	  public Automovel(String descricao, int ano, String placa, int codigoDoPreco) {
	    this.descricao = descricao;
	    this.placa = placa;
	    this.ano = ano;
		this.setCodigoDoPreco(codigoDoPreco);

	  }
	 
	  public String getDescricao() {
	    return descricao;
	  }
	  
	  public String getPlaca() {
	    return placa;
	  }
	  
	  public int getAno() {
	    return ano;
	  }
	 
	

		public void setCodigoDoPreco(int codigoDoPreco ) {
			Fabrica fabrica = new Fabrica();
			this.classificacao = fabrica.create(codigoDoPreco);
	  }
	

	  @Override
	   public Double ValorLocacao(int dias_alugados){			
			return this.classificacao.getValorDaLocacao(dias_alugados);	
		}

		


		@Override
		public int calculoPontoPorCarro(int dias_alugados) {
			return this.classificacao.getPontosDeAlugadorFrequente(dias_alugados);
				


	}
}
