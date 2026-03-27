package locadora;

public class Automovel implements AlugaveisInt {

	  private String descricao;
	  private String placa;
	  private int ano; // Ano de fabricacao
	  private Classificacao classificacao;

	  public Automovel(String descricao, int ano, String placa, Classificacao classificacao) {
	    this.descricao = descricao;
	    this.placa = placa;
	    this.ano = ano;
		this.classificacao = classificacao;
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
	 
	  public int getCodigoDoPreco() {
	      return this.classificacao.getCodigoDoPreco();
	  }

		public int setCodigoDoPreco(Classificacao classificacao) {

			switch (classificacao) {
				case Familia:
					return new Familia();
				case Luxo:
					return new Familia()
				case Basico:
					return new Familia()
				
					break;
			
				default:
					break;
			}
	      return this.classificacao = new Classificacao() {
			
		  };
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
