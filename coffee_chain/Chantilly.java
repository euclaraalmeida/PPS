// handle concreto
public class Chantilly extends AdicionalHandler {
    


	public String getDescricao() {
         if (proximo!=null){
        proximo.getDescricao();
        return proximo.getDescricao() + ", com chantilly";
    }
        return "com chantilly";
    }

    public double getCusto() {
        if (proximo!=null){
        proximo.getCusto();
        return proximo.getCusto() + 3.0;
    }
        return 3.0;
    }
}
