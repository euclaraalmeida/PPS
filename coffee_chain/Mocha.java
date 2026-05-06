package decorator;

// Componente concreto
public class Mocha extends AdicionalHandler {

    
    public String getDescricao() {
        if(proximo!=null){
            return "Mocha, " + proximo.getDescricao();
        }
        return "Mocha";
    }

    public double getCusto() {
         if(proximo!=null){
            return proximo.getD();
        }
        return 20.0;
    }

}
