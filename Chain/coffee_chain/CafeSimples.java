
// Componente concreto
public class CafeSimples  extends AdicionalHandler {
    public String getDescricao() {
        if (proximo!=null){ 
        return "Cafe simples, " + proximo.getDescricao() ;}
        return "Cafe simples"; }

    
    public double getCusto() {
        if (proximo!=null){ 
        return proximo.getCusto() + 4.0;}// 8 reias
        return 4.0;   }


   
}


