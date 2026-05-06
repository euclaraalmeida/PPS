// handle concreto
//Concrete Decorators: definem os comportamentos adicionais
// que podem ser acrescentados aos componentes dinamicamentes.
public class Leite extends AdicionalHandler {
	 


	
	
	public String getDescricao() {
		if (proximo!=null){
			proximo.getDescricao();
	
        	return proximo.getDescricao() + ", com leite";
		 }
		return getDescricao() + ", com leite";
	}
	
	 public double getCusto() {
		if (proximo!=null){
        proximo.getCusto();
		return proximo.getCusto() + 1.0;  // 4.0
	 }return getCusto() + 1.0;
}
}