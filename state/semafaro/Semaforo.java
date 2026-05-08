import java.util.HashMap;
import java.util.Map;

import java.lang.Thread;

public class Semaforo {

	
	protected Estado estado;

	private Map<Sinal, Integer> transicao = new HashMap<Sinal,Integer>();
	
	public Semaforo() {
        this.estado = new Verde();
		this.setSemafaro(this);
	}
	
	

	public void changeState(Estado estado){
		this.estado = estado;
		this.setSemafaro(this);

	}

	
	public Sinal getEstadoAtual() {
		return estado;
	}
	
	public void setup(Sinal estagio, int novo_tempo_transicao) {
		this.transicao.put(estagio,novo_tempo_transicao);
	}
	
	public void exibir() {
		estado.exibir();
	}
	
	
	
	public void showVisorRegressivo() {
		for (int i = transicao.get(getEstadoAtual()); i >0 ; i--) {
			System.out.println(i + " segundo(s)");
			try {
				// 1000 milisegundos equivale a 1 segundo
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	public void start() {
		this.start(10);
	}

	public void start(int time_in_seconds) {
		while(time_in_seconds > 0) {
			System.out.println("Tempo restante da simulacao: " + time_in_seconds + " segundos");
			System.out.println( getEstadoAtual() + " : " + transicao.get(getEstadoAtual()) + " segundos.");
			exibir();
			time_in_seconds -= transicao.get(getEstadoAtual());
			showVisorRegressivo();
			efetuarTransicao();
			System.out.println();
			
		}
		
	}
	
	public String toString() {
		String s = "";
		s += "Tempo de permanencia em cada estagio:\n";
		s += Sinal.VERMELHO + " : " + transicao.get(Sinal.VERMELHO) + " segundos\n";
		s += Sinal.AMARELO + " : " + transicao.get(Sinal.AMARELO) + " segundos\n";
		s += Sinal.VERDE + " : " + transicao.get(Sinal.VERDE) + " segundos\n";
		return s;
	}
	

}
