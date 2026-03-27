package locadora;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cliente {
	private String nome;
	private List<Locacao> carrosAlugados = new ArrayList<Locacao>();

	public Cliente(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void adicionaLocacao(Locacao locacao) {
		carrosAlugados.add(locacao);
	}

	public double getValorTotal(){
		double valorTotal = 0.0;
		Iterator<Locacao> locacoes = carrosAlugados.iterator();
		while(locacoes.hasNext()) {
			Locacao carroLocado = locacoes.next();
			valorTotal += carroLocado.getCarro().ValorLocacao(carroLocado.getDiasAlugado());
		}return valorTotal;

	}

	

	public String extrato() {
		final String fimDeLinha = System.getProperty("line.separator");
		int sequencia = 0;
		int pontosfrequente = 0;

		Iterator<Locacao> locacoes = carrosAlugados.iterator();
		String resultado = "Registro de Locacoes de " + getNome() + fimDeLinha;
		resultado += String.format("Seq Automovel             Ano  Diarias   Valor Pago"+fimDeLinha);
		resultado += String.format("=== ==================== ===== ========= ==========="+fimDeLinha);
		

		while(locacoes.hasNext()) {
			Locacao carroLocado = locacoes.next();

			pontosfrequente += carroLocado.ValorDoPonto();

			// trata de pontos de locador frequente
			// adiciona bonus para locação de um carro de luxo por pelo menos 3 dias
			
			// mostra valores para esta locação
			sequencia++;
			resultado += String.format("%02d. %-20s  %4d    %2d     R$ %8.2f"+fimDeLinha,sequencia, carroLocado.getCarro().getDescricao(),carroLocado.getCarro().getAno(), carroLocado.getDiasAlugado(), carroLocado.ValorDaLocacao());

		} // while

		// adiciona rodapé
		resultado += "====================================================" + fimDeLinha;
		resultado += String.format("Valor Acumulado em di�rias............:  R$ %8.2f" + fimDeLinha,getValorTotal());
		resultado += "Voce acumulou " + pontosfrequente  +
              " pontos de locador frequente";

		return resultado;
	}

}