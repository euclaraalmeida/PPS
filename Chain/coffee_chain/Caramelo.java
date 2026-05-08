// handle concreto
public class Caramelo extends AdicionalHandler {
    
    public  String getDescricao() {
        if (proximo!=null){
        proximo.getDescricao();
        return proximo.getDescricao() + ", com caramelo";}
        
            return getDescricao() + ", com caramelo";

        }
    

    public   double getCusto() {
        if (proximo!=null){
        proximo.getCusto();
        return proximo.getCusto() + 2.0;
    }
        return getCusto() + 2.0;
    }

    
 
}